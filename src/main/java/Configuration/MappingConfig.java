package Configuration;

import Configuration.MapChannel;
import com.fasterxml.jackson.annotation.*;

import java.util.List;

public class MappingConfig {
    private List<MapChannel> channels;

    @JsonProperty("channels")
    public List<MapChannel> getChannels() {
        return channels;
    }

    @JsonProperty("channels")
    public void setChannels(List<MapChannel> value) {
        this.channels = value;
    }

    public MapChannel getChannelByName(String channelName){
        for (MapChannel channel : channels){
            if(channel.getChannelName().equals(channelName)){
                return channel;
            }
        }
        return null;
    }
}

