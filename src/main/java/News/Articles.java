package News;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Articles {
    private String title;
    private String description;
    private String url;
    private String guid;
    private String pubDate;
    private String category;
    private String author;

    public Articles(String title, String url, String description, String guid, String pubDate, String author) {
        this.guid = guid;
        this.title = title;
        this.description = description;
        this.url = url;
        this.pubDate = pubDate;
        this.author = author;

    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String value) {
        this.title = value;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String value) {
        this.description = value;
    }

    @JsonProperty("url")
    public String getURL() {
        return url;
    }

    @JsonProperty("url")
    public void setURL(String value) {
        this.url = value;
    }

    @JsonProperty("guid")
    public String getGUID() {
        return guid;
    }

    @JsonProperty("guid")
    public void setGUID(String value) {
        this.guid = value;
    }

    @JsonProperty("pubDate")
    public String getPubDate() {
        return pubDate;
    }

    @JsonProperty("pubDate")
    public void setPubDate(String value) {
        this.pubDate = value;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String value) {
        this.category = value;
    }

    @JsonProperty("author")
    public String getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(String value) {
        this.author = value;
    }

    private List<Articles> articleList;

    public List<Articles> getArticleList() {
        return articleList;
    }

    public void setArticleList(List<Articles> articleList) {
        this.articleList = articleList;
    }
}
