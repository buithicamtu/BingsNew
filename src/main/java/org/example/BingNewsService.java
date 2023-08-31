package org.example;

import Configuration.BingNewsConfig;
import Configuration.MappingConfig;
import News.AdTopic;
import News.Articles;
import News.FinancialInfo;
import News.WeatherInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BingNewsService {
    public static <T> T ReadJSON(String jsonPath, Class<T> classConfig) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new File(jsonPath), classConfig);
    }

    //Get list URL from BingNewsConfig
    public static List<BingNewsConfig.Channel> getListChannel(BingNewsConfig config) {
        var categories = config.getCategories();
        //loop each category, get each channel, get each URL
        var listChannels = new ArrayList<>();
        for (var cat : categories) {
            for (var channel : cat.getChannels()) {
                listChannels.add(cat.getChannels());
            }
        }
        return null;
    }

    // How to get URL in cat(1) + channel (2)?
    public static List<Articles> getAllArticles() throws ParserConfigurationException, IOException, SAXException {
        String cfgPath = "src\\main\\resources\\bingNewsConfig.json";
        //TODO: get all RSS URL from JSON
        List<BingNewsConfig.Channel> listChannel = getListChannel(new BingNewsConfig(cfgPath));

        //TODO: Get all items from each URL --> Add to NodeList
        List<Articles> listItems = new ArrayList<>();
        for (var channel : listChannel) {
            NodeList nodeList = getItemsFromRssUrl(channel.getRssURL());

            //TODO: MAP NODELIST -> ARTICLES <- Read mapping _ Which channel that URL from?
            return null;

        }
        return listItems;
    }

    public static NodeList getItemsFromRssUrl(String url) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = (Document) db.parse(new URL(url).openStream());
        NodeList listItems = doc.getElementsByTagName("item");

        for (int i = 0; i < listItems.getLength(); i++) {
            Element item = (Element) listItems.item(i);
            NodeList children = item.getChildNodes();

            for (int j = 0; j < children.getLength(); j++) {
                Node child = children.item(j);

                if (child.getNodeType() == Node.ELEMENT_NODE) {
                    String tagName = child.getNodeName();
                    String tagValue = child.getTextContent();
                    //System.out.println(tagName + ": " + tagValue);
                }
            }
            //System.out.println();
        }
        return listItems;
    }
    public static List<AdTopic> getAllAdTopic () {

        return null;
    }

    public static List<Articles> getTopNews () {
        //Top News: get the newest News
        // base on public time (compared to Current time)
        return null;
    }

    public static List<Articles> getTrendingNews () {
        //Top News: get from Google Trending RSS
        //Get URL of GgTrend in bingNewsConfig
        // continue use get All Articles
        return null;
    }

    public static List<WeatherInfo> getWeatherInfo () {
        return null;
    }

    public static List<FinancialInfo> getFinancialInfo () {
        return null;
    }

    public static void readTrending (String trendingConfig){

    }
    public static void readMappingConfig (MappingConfig mappingConfig){
    }
}
