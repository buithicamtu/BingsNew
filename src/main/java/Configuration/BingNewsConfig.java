package Configuration;

import java.util.List;

public class BingNewsConfig {
    public BingNewsConfig(String config) {

    }
    private List<Category> categories;

    public List<Category> getCategories() {
        return categories;
    }
    private List<Channel> channels;

    public List<Channel> getChannels() {
        return channels;
    }

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }

}
