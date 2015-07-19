package com.lfdversluis.retrofittwitchapi.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class TwitchChannelVideos {

    @SerializedName("_total")
    @Expose
    private Integer Total;
    @SerializedName("_links")
    @Expose
    private Links Links;
    @Expose
    private List<Video> videos = new ArrayList<>();

    /**
     * @return The Total
     */
    public Integer getTotal() {
        return Total;
    }

    /**
     * @param Total The _total
     */
    public void setTotal(Integer Total) {
        this.Total = Total;
    }

    /**
     * @return The StreamLink
     */
    public Links getLinks() {
        return Links;
    }

    /**
     * @param Links The _links
     */
    public void setLinks(Links Links) {
        this.Links = Links;
    }

    /**
     * @return The videos
     */
    public List<Video> getVideos() {
        return videos;
    }

    /**
     * @param videos The videos
     */
    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }


    public class Fps {

        @SerializedName("audio_only")
        @Expose
        private Double audioOnly;
        @Expose
        private Double medium;
        @Expose
        private Double mobile;
        @Expose
        private Double high;
        @Expose
        private Double low;
        @Expose
        private Double chunked;

        /**
         * @return The audioOnly
         */
        public Double getAudioOnly() {
            return audioOnly;
        }

        /**
         * @param audioOnly The audio_only
         */
        public void setAudioOnly(Double audioOnly) {
            this.audioOnly = audioOnly;
        }

        /**
         * @return The medium
         */
        public Double getMedium() {
            return medium;
        }

        /**
         * @param medium The medium
         */
        public void setMedium(Double medium) {
            this.medium = medium;
        }

        /**
         * @return The mobile
         */
        public Double getMobile() {
            return mobile;
        }

        /**
         * @param mobile The mobile
         */
        public void setMobile(Double mobile) {
            this.mobile = mobile;
        }

        /**
         * @return The high
         */
        public Double getHigh() {
            return high;
        }

        /**
         * @param high The high
         */
        public void setHigh(Double high) {
            this.high = high;
        }

        /**
         * @return The low
         */
        public Double getLow() {
            return low;
        }

        /**
         * @param low The low
         */
        public void setLow(Double low) {
            this.low = low;
        }

        /**
         * @return The chunked
         */
        public Double getChunked() {
            return chunked;
        }

        /**
         * @param chunked The chunked
         */
        public void setChunked(Double chunked) {
            this.chunked = chunked;
        }

    }

    public class Links {

        @Expose
        private String self;
        @Expose
        private String next;

        /**
         * @return The self
         */
        public String getSelf() {
            return self;
        }

        /**
         * @param self The self
         */
        public void setSelf(String self) {
            this.self = self;
        }

        /**
         * @return The next
         */
        public String getNext() {
            return next;
        }

        /**
         * @param next The next
         */
        public void setNext(String next) {
            this.next = next;
        }

    }

    public class VideoLinks {

        @Expose
        private String self;
        @Expose
        private String channel;

        /**
         * @return The self
         */
        public String getSelf() {
            return self;
        }

        /**
         * @param self The self
         */
        public void setSelf(String self) {
            this.self = self;
        }

        /**
         * @return The channel
         */
        public String getChannel() {
            return channel;
        }

        /**
         * @param channel The channel
         */
        public void setChannel(String channel) {
            this.channel = channel;
        }

    }

    public class Resolutions {

        @Expose
        private String medium;
        @Expose
        private String mobile;
        @Expose
        private String high;
        @Expose
        private String low;
        @Expose
        private String chunked;

        /**
         * @return The medium
         */
        public String getMedium() {
            return medium;
        }

        /**
         * @param medium The medium
         */
        public void setMedium(String medium) {
            this.medium = medium;
        }

        /**
         * @return The mobile
         */
        public String getMobile() {
            return mobile;
        }

        /**
         * @param mobile The mobile
         */
        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        /**
         * @return The high
         */
        public String getHigh() {
            return high;
        }

        /**
         * @param high The high
         */
        public void setHigh(String high) {
            this.high = high;
        }

        /**
         * @return The low
         */
        public String getLow() {
            return low;
        }

        /**
         * @param low The low
         */
        public void setLow(String low) {
            this.low = low;
        }

        /**
         * @return The chunked
         */
        public String getChunked() {
            return chunked;
        }

        /**
         * @param chunked The chunked
         */
        public void setChunked(String chunked) {
            this.chunked = chunked;
        }

    }

    public class Video {

        @Expose
        private String title;
        @Expose
        private Object description;
        @SerializedName("broadcast_id")
        @Expose
        private Long broadcastId;
        @Expose
        private String status;
        @SerializedName("tag_list")
        @Expose
        private String tagList;
        @SerializedName("_id")
        @Expose
        private String Id;
        @SerializedName("recorded_at")
        @Expose
        private String recordedAt;
        @Expose
        private String game;
        @Expose
        private Integer length;
        @Expose
        private String preview;
        @Expose
        private String url;
        @Expose
        private Integer views;
        @Expose
        private Fps fps;
        @Expose
        private Resolutions resolutions;
        @SerializedName("broadcast_type")
        @Expose
        private String broadcastType;
        @SerializedName("_links")
        @Expose
        private VideoLinks Links;
        @Expose
        private Channel channel;

        /**
         * @return The title
         */
        public String getTitle() {
            return title;
        }

        /**
         * @param title The title
         */
        public void setTitle(String title) {
            this.title = title;
        }

        /**
         * @return The description
         */
        public Object getDescription() {
            return description;
        }

        /**
         * @param description The description
         */
        public void setDescription(Object description) {
            this.description = description;
        }

        /**
         * @return The broadcastId
         */
        public Long getBroadcastId() {
            return broadcastId;
        }

        /**
         * @param broadcastId The broadcast_id
         */
        public void setBroadcastId(Long broadcastId) {
            this.broadcastId = broadcastId;
        }

        /**
         * @return The status
         */
        public String getStatus() {
            return status;
        }

        /**
         * @param status The status
         */
        public void setStatus(String status) {
            this.status = status;
        }

        /**
         * @return The tagList
         */
        public String getTagList() {
            return tagList;
        }

        /**
         * @param tagList The tag_list
         */
        public void setTagList(String tagList) {
            this.tagList = tagList;
        }

        /**
         * @return The Id
         */
        public String getId() {
            return Id;
        }

        /**
         * @param Id The _id
         */
        public void setId(String Id) {
            this.Id = Id;
        }

        /**
         * @return The recordedAt
         */
        public String getRecordedAt() {
            return recordedAt;
        }

        /**
         * @param recordedAt The recorded_at
         */
        public void setRecordedAt(String recordedAt) {
            this.recordedAt = recordedAt;
        }

        /**
         * @return The game
         */
        public String getGame() {
            return game;
        }

        /**
         * @param game The game
         */
        public void setGame(String game) {
            this.game = game;
        }

        /**
         * @return The length
         */
        public Integer getLength() {
            return length;
        }

        /**
         * @param length The length
         */
        public void setLength(Integer length) {
            this.length = length;
        }

        /**
         * @return The preview
         */
        public String getPreview() {
            return preview;
        }

        /**
         * @param preview The preview
         */
        public void setPreview(String preview) {
            this.preview = preview;
        }

        /**
         * @return The url
         */
        public String getUrl() {
            return url;
        }

        /**
         * @param url The url
         */
        public void setUrl(String url) {
            this.url = url;
        }

        /**
         * @return The views
         */
        public Integer getViews() {
            return views;
        }

        /**
         * @param views The views
         */
        public void setViews(Integer views) {
            this.views = views;
        }

        /**
         * @return The fps
         */
        public Fps getFps() {
            return fps;
        }

        /**
         * @param fps The fps
         */
        public void setFps(Fps fps) {
            this.fps = fps;
        }

        /**
         * @return The resolutions
         */
        public Resolutions getResolutions() {
            return resolutions;
        }

        /**
         * @param resolutions The resolutions
         */
        public void setResolutions(Resolutions resolutions) {
            this.resolutions = resolutions;
        }

        /**
         * @return The broadcastType
         */
        public String getBroadcastType() {
            return broadcastType;
        }

        /**
         * @param broadcastType The broadcast_type
         */
        public void setBroadcastType(String broadcastType) {
            this.broadcastType = broadcastType;
        }

        /**
         * @return The StreamLink
         */
        public VideoLinks getLinks() {
            return Links;
        }

        /**
         * @param Links The _links
         */
        public void setLinks(VideoLinks Links) {
            this.Links = Links;
        }

        /**
         * @return The channel
         */
        public Channel getChannel() {
            return channel;
        }

        /**
         * @param channel The channel
         */
        public void setChannel(Channel channel) {
            this.channel = channel;
        }

    }

    public class Channel {

        @Expose
        private String name;
        @SerializedName("display_name")
        @Expose
        private String displayName;

        /**
         * @return The name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * @return The displayName
         */
        public String getDisplayName() {
            return displayName;
        }

        /**
         * @param displayName The display_name
         */
        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

    }
}