package Configuration;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;

public class Channel {
    private String name;
    private String rssURL;


    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getRssURL() {
        return rssURL;
    }

    public void setRssURL(String value) {
        this.rssURL = value;
    }

}
