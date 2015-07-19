package com.lfdversluis.retrofittwitchapi.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TwitchChannel {

    @Expose
    private boolean mature;
    @Expose
    private String status;
    @SerializedName("broadcaster_language")
    @Expose
    private String broadcasterLanguage;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @Expose
    private String game;
    @Expose
    private Object delay;
    @Expose
    private String language;
    @SerializedName("_id")
    @Expose
    private Integer Id;
    @Expose
    private String name;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @Expose
    private String logo;
    @Expose
    private Object banner;
    @SerializedName("video_banner")
    @Expose
    private Object videoBanner;
    @Expose
    private Object background;
    @SerializedName("profile_banner")
    @Expose
    private String profileBanner;
    @SerializedName("profile_banner_background_color")
    @Expose
    private String profileBannerBackgroundColor;
    @Expose
    private Boolean partner;
    @Expose
    private String url;
    @Expose
    private Integer views;
    @Expose
    private Integer followers;
    @SerializedName("_links")
    @Expose
    private Links Links;
    @Expose
    private String email;
    @SerializedName("stream_key")
    @Expose
    private String streamKey;

    /**
     * @return The mature
     */
    public Object getMature() {
        return mature;
    }

    /**
     * @param mature The mature
     */
    public void setMature(boolean mature) {
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
     * @return The delay
     */
    public Object getDelay() {
        return delay;
    }

    /**
     * @param delay The delay
     */
    public void setDelay(Object delay) {
        this.delay = delay;
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

    /**
     * @return The Id
     */
    public Integer getId() {
        return Id;
    }

    /**
     * @param Id The _id
     */
    public void setId(Integer Id) {
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
     * @return The videoBanner
     */
    public Object getVideoBanner() {
        return videoBanner;
    }

    /**
     * @param videoBanner The video_banner
     */
    public void setVideoBanner(Object videoBanner) {
        this.videoBanner = videoBanner;
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
     * @return The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email The email
     */
    public void setEmail(String email) {
        this.email = email;
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


    public class Links {

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
        private String teams;
        @Expose
        private String videos;

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

    }
}