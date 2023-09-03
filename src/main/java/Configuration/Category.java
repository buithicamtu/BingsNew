package Configuration;

import java.util.List;

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
