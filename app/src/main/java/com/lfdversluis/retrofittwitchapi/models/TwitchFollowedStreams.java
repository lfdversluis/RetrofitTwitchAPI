package com.lfdversluis.retrofittwitchapi.Models;

import com.google.gson.annotations.SerializedName;


import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

public class TwitchFollowedStreams {

    @Expose
    private List<Stream> streams = new ArrayList<>();
    @SerializedName("_total")
    @Expose
    private Integer Total;
    @SerializedName("_links")
    @Expose
    private TwitchFollowedStreams.Links Links;

    /**
     * @return The streams
     */
    public List<Stream> getStreams() {
        return streams;
    }

    /**
     * @param streams The streams
     */
    public void setStreams(List<Stream> streams) {
        this.streams = streams;
    }

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
    public TwitchFollowedStreams.Links getLinks() {
        return Links;
    }

    /**
     * @param Links The _links
     */
    public void setLinks(TwitchFollowedStreams.Links Links) {
        this.Links = Links;
    }

    public class Channel {

        @SerializedName("_links")
        @Expose
        private ChannelLinks Links;
        @Expose
        private Object background;
        @Expose
        private Object banner;
        @SerializedName("broadcaster_language")
        @Expose
        private String broadcasterLanguage;
        @SerializedName("display_name")
        @Expose
        private String displayName;
        @Expose
        private String game;
        @Expose
        private String logo;
        @Expose
        private Boolean mature;
        @Expose
        private String status;
        @Expose
        private Boolean partner;
        @Expose
        private String url;
        @SerializedName("video_banner")
        @Expose
        private String videoBanner;
        @SerializedName("_id")
        @Expose
        private Long Id;
        @Expose
        private String name;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;
        @Expose
        private Integer delay;
        @Expose
        private Integer followers;
        @SerializedName("profile_banner")
        @Expose
        private String profileBanner;
        @SerializedName("profile_banner_background_color")
        @Expose
        private String profileBannerBackgroundColor;
        @Expose
        private Integer views;
        @Expose
        private String language;

        /**
         * @return The StreamLink
         */
        public ChannelLinks getLinks() {
            return Links;
        }

        /**
         * @param Links The _links
         */
        public void setLinks(ChannelLinks Links) {
            this.Links = Links;
        }

        /**
         * @return The background
         */
        public Object getBackground() {
            return background;
        }

        /**
         * @param background The background
         */
        public void setBackground(Object background) {
            this.background = background;
        }

        /**
         * @return The banner
         */
        public Object getBanner() {
            return banner;
        }

        /**
         * @param banner The banner
         */
        public void setBanner(Object banner) {
            this.banner = banner;
        }

        /**
         * @return The broadcasterLanguage
         */
        public String getBroadcasterLanguage() {
            return broadcasterLanguage;
        }

        /**
         * @param broadcasterLanguage The broadcaster_language
         */
        public void setBroadcasterLanguage(String broadcasterLanguage) {
            this.broadcasterLanguage = broadcasterLanguage;
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
         * @return The logo
         */
        public String getLogo() {
            return logo;
        }

        /**
         * @param logo The logo
         */
        public void setLogo(String logo) {
            this.logo = logo;
        }

        /**
         * @return The mature
         */
        public Boolean getMature() {
            return mature;
        }

        /**
         * @param mature The mature
         */
        public void setMature(Boolean mature) {
            this.mature = mature;
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
         * @return The partner
         */
        public Boolean getPartner() {
            return partner;
        }

        /**
         * @param partner The partner
         */
        public void setPartner(Boolean partner) {
            this.partner = partner;
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
         * @return The videoBanner
         */
        public String getVideoBanner() {
            return videoBanner;
        }

        /**
         * @param videoBanner The video_banner
         */
        public void setVideoBanner(String videoBanner) {
            this.videoBanner = videoBanner;
        }

        /**
         * @return The Id
         */
        public Long getId() {
            return Id;
        }

        /**
         * @param Id The _id
         */
        public void setId(Long Id) {
            this.Id = Id;
        }

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
         * @return The createdAt
         */
        public String getCreatedAt() {
            return createdAt;
        }

        /**
         * @param createdAt The created_at
         */
        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        /**
         * @return The updatedAt
         */
        public String getUpdatedAt() {
            return updatedAt;
        }

        /**
         * @param updatedAt The updated_at
         */
        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        /**
         * @return The delay
         */
        public Integer getDelay() {
            return delay;
        }

        /**
         * @param delay The delay
         */
        public void setDelay(Integer delay) {
            this.delay = delay;
        }

        /**
         * @return The followers
         */
        public Integer getFollowers() {
            return followers;
        }

        /**
         * @param followers The followers
         */
        public void setFollowers(Integer followers) {
            this.followers = followers;
        }

        /**
         * @return The profileBanner
         */
        public String getProfileBanner() {
            return profileBanner;
        }

        /**
         * @param profileBanner The profile_banner
         */
        public void setProfileBanner(String profileBanner) {
            this.profileBanner = profileBanner;
        }

        /**
         * @return The profileBannerBackgroundColor
         */
        public String getProfileBannerBackgroundColor() {
            return profileBannerBackgroundColor;
        }

        /**
         * @param profileBannerBackgroundColor The profile_banner_background_color
         */
        public void setProfileBannerBackgroundColor(String profileBannerBackgroundColor) {
            this.profileBannerBackgroundColor = profileBannerBackgroundColor;
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
         * @return The language
         */
        public String getLanguage() {
            return language;
        }

        /**
         * @param language The language
         */
        public void setLanguage(String language) {
            this.language = language;
        }

    }

    public class StreamLink {

        @Expose
        private String self;

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

    }

    public class ChannelLinks {

        @Expose
        private String self;
        @Expose
        private String follows;
        @Expose
        private String commercial;
        @SerializedName("stream_key")
        @Expose
        private String streamKey;
        @Expose
        private String chat;
        @Expose
        private String features;
        @Expose
        private String subscriptions;
        @Expose
        private String editors;
        @Expose
        private String videos;
        @Expose
        private String teams;

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
         * @return The follows
         */
        public String getFollows() {
            return follows;
        }

        /**
         * @param follows The follows
         */
        public void setFollows(String follows) {
            this.follows = follows;
        }

        /**
         * @return The commercial
         */
        public String getCommercial() {
            return commercial;
        }

        /**
         * @param commercial The commercial
         */
        public void setCommercial(String commercial) {
            this.commercial = commercial;
        }

        /**
         * @return The streamKey
         */
        public String getStreamKey() {
            return streamKey;
        }

        /**
         * @param streamKey The stream_key
         */
        public void setStreamKey(String streamKey) {
            this.streamKey = streamKey;
        }

        /**
         * @return The chat
         */
        public String getChat() {
            return chat;
        }

        /**
         * @param chat The chat
         */
        public void setChat(String chat) {
            this.chat = chat;
        }

        /**
         * @return The features
         */
        public String getFeatures() {
            return features;
        }

        /**
         * @param features The features
         */
        public void setFeatures(String features) {
            this.features = features;
        }

        /**
         * @return The subscriptions
         */
        public String getSubscriptions() {
            return subscriptions;
        }

        /**
         * @param subscriptions The subscriptions
         */
        public void setSubscriptions(String subscriptions) {
            this.subscriptions = subscriptions;
        }

        /**
         * @return The editors
         */
        public String getEditors() {
            return editors;
        }

        /**
         * @param editors The editors
         */
        public void setEditors(String editors) {
            this.editors = editors;
        }

        /**
         * @return The videos
         */
        public String getVideos() {
            return videos;
        }

        /**
         * @param videos The videos
         */
        public void setVideos(String videos) {
            this.videos = videos;
        }

        /**
         * @return The teams
         */
        public String getTeams() {
            return teams;
        }

        /**
         * @param teams The teams
         */
        public void setTeams(String teams) {
            this.teams = teams;
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

    public class Preview {

        @Expose
        private String small;
        @Expose
        private String medium;
        @Expose
        private String large;
        @Expose
        private String template;

        /**
         * @return The small
         */
        public String getSmall() {
            return small;
        }

        /**
         * @param small The small
         */
        public void setSmall(String small) {
            this.small = small;
        }

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
         * @return The large
         */
        public String getLarge() {
            return large;
        }

        /**
         * @param large The large
         */
        public void setLarge(String large) {
            this.large = large;
        }

        /**
         * @return The template
         */
        public String getTemplate() {
            return template;
        }

        /**
         * @param template The template
         */
        public void setTemplate(String template) {
            this.template = template;
        }

    }

    public class Stream {

        @SerializedName("_id")
        @Expose
        private Long Id;
        @Expose
        private String game;
        @Expose
        private Integer viewers;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("video_height")
        @Expose
        private Integer videoHeight;
        @SerializedName("average_fps")
        @Expose
        private Double averageFps;
        @SerializedName("_links")
        @Expose
        private StreamLink StreamLink;
        @Expose
        private Preview preview;
        @Expose
        private Channel channel;

        /**
         * @return The Id
         */
        public Long getId() {
            return Id;
        }

        /**
         * @param Id The _id
         */
        public void setId(Long Id) {
            this.Id = Id;
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
         * @return The viewers
         */
        public Integer getViewers() {
            return viewers;
        }

        /**
         * @param viewers The viewers
         */
        public void setViewers(Integer viewers) {
            this.viewers = viewers;
        }

        /**
         * @return The createdAt
         */
        public String getCreatedAt() {
            return createdAt;
        }

        /**
         * @param createdAt The created_at
         */
        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        /**
         * @return The videoHeight
         */
        public Integer getVideoHeight() {
            return videoHeight;
        }

        /**
         * @param videoHeight The video_height
         */
        public void setVideoHeight(Integer videoHeight) {
            this.videoHeight = videoHeight;
        }

        /**
         * @return The averageFps
         */
        public Double getAverageFps() {
            return averageFps;
        }

        /**
         * @param averageFps The average_fps
         */
        public void setAverageFps(Double averageFps) {
            this.averageFps = averageFps;
        }

        /**
         * @return The StreamLink
         */
        public StreamLink getStreamLink() {
            return StreamLink;
        }

        /**
         * @param StreamLink The _links
         */
        public void setStreamLink(StreamLink StreamLink) {
            this.StreamLink = StreamLink;
        }

        /**
         * @return The preview
         */
        public Preview getPreview() {
            return preview;
        }

        /**
         * @param preview The preview
         */
        public void setPreview(Preview preview) {
            this.preview = preview;
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

}
