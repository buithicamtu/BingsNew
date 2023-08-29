package org.example;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String bingNewsConFig = "";
        BingNewsService.readBingNewsConfig(bingNewsConFig);
        String trendingConfig = "";
        BingNewsService.readTrending(trendingConfig);

        var categories = BingNewsService.getAllArticles();
        var adTopic = BingNewsService.getAllAdTopic();
        var topNews = BingNewsService.getTopNews();
        var trendingNews = BingNewsService.getTrendingNews();
        var weatherInfo = BingNewsService.getWeatherInfo();
        var financialInfo = BingNewsService.getFinancialInfo();

    }

    public static class BingNewsService {
        public static void readBingNewsConfig(BingNewsConfig bingNewsConfig) {
            var categories = bingNewsConfig.getCategories();
            /*
            loop each category, get each channel, get each
             */
            var listURL = new ArrayList<>();
            for (var cat : categories) {
                for (var channel : cat.getChannels()) {
                    listURL.add(channel.getRssURL());
                }
                return;
            }
        }

        public static void readMapperConfig(mappingConfig _mappingConfig) {
            mappingConfig = _mappingConfig;
        }


        public static NodeList getAllArticles(BingNewsConfig bingNewsConfig) throws ParserConfigurationException, IOException, SAXException {
            //TODO: read all RSS from JSON
            List<String> listURLs = readBingNewsConfig();

            //TODO: read all items from each URL --> Add to NodeList
            //TODO: From NodeList -> Parse data to get each item --> Add to listItems
            //TODO: Map Item to Article
//            List<Articles> listItems = new ArrayList<>();
//            for (var item : listURLs) {
//                NodeList nodeList =  getItemsFromRssUrl(item);
//                for (int i = 0; i <= nodeList.getLength(); i++) {
//                    Articles atc = parseData();
//                    listItems.add(atc);
//                }
//            }
            return null;
        }

        public static Articles parseData(Node item, mappingConfig mapCfg) {
        return null;
        }

        public static NodeList getItemsFromRssUrl(String url) throws ParserConfigurationException, IOException, SAXException {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = (Document) db.parse(new URL(url).openStream());
            var listItems = doc.getElementsByTagName("item");
            return listItems;
        }

        public static List<AdTopic> getAllAdTopic() {
            return null;
        }

        public static List<Articles> getTopNews() {
            return null;
        }

        public static List<Articles> getTrendingNews() {
            return null;
        }

        public static List<WeatherInfo> getWeatherInfo() {
            return null;
        }

        public static List<FinancialInfo> getFinancialInfo() {
            return null;
        }

        public static void readTrending(String trendingConfig) {

        }
    }
    public static class Articles {
    }

    public static class WeatherInfo {
    }

    public static class FinancialInfo {
    }

    public static class mappingConfig {
    }
}