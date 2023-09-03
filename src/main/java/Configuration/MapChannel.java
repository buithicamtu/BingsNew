package Configuration;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;

public class MapChannel {
    private String ChannelName;
    private HashMap<String, String> mapSrcDES;

    @JsonProperty("ChannelName")
    public String getChannelName() {
        return ChannelName;
    }

    @JsonProperty("channelName")
    public void setChannelName(String value) {
        this.ChannelName = value;
    }
    @JsonProperty("mapSrcDes")
    public HashMap<String, String> getMapperConfig() {
        return mapSrcDES;
    }
    @JsonProperty("mapSrcDes")
    public void setMapSrcDES(HashMap<String, String> value) {
        this.mapSrcDES = value;
    }


}
