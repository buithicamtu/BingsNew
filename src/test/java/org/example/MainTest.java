package org.example;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    public void getItemsFromRssUrl() throws ParserConfigurationException, IOException, SAXException {
        String path = "https://vnexpress.net/rss/tin-moi-nhat.rss";
        NodeList list = Main.BingNewsService.getItemsFromRssUrl(path);
        assertNotNull(list);
    }

    @org.junit.jupiter.api.Test
    void getAllAdTopic() {
    }

    @org.junit.jupiter.api.Test
    void getTopNews() {
    }

    @org.junit.jupiter.api.Test
    void getTrendingNews() {
    }
}