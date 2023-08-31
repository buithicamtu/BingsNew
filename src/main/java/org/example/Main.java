package org.example;

import Configuration.BingNewsConfig;
import Configuration.MappingConfig;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");

        String bingNewsConFig = "src/main/resources/bingNewsConfig.json";
        BingNewsService.ReadJSON(bingNewsConFig, BingNewsConfig.class);
        String mapperCfg = "src/main/resources/mappingNews.json";
        BingNewsService.ReadJSON(mapperCfg, MappingConfig.class);
        String trendingConfig = "";
        BingNewsService.ReadJSON(trendingConfig, BingNewsConfig.class);

        var categories = BingNewsService.getAllArticles();
        var adTopic = BingNewsService.getAllAdTopic();
        var topNews = BingNewsService.getTopNews();
        var trendingNews = BingNewsService.getTrendingNews();
        var weatherInfo = BingNewsService.getWeatherInfo();
        var financialInfo = BingNewsService.getFinancialInfo();

    }
}