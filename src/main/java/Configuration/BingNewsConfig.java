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

    public class Category {
        private String title;
        private List<Channel> channels;

        public String getTitle() {
            return title;
        }

        public void setTitle(String value) {
            this.title = value;
        }

        public List<Channel> getChannels() {
            return channels;
        }

        public void setChannels(List<Channel> value) {
            this.channels = value;
        }
    }

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

}
