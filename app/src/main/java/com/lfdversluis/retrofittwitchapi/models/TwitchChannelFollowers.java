package com.lfdversluis.retrofittwitchapi.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class TwitchChannelFollowers {

    @Expose
    private List<Follower> follows = new ArrayList<Follower>();
    @SerializedName("_total")
    @Expose
    private Integer Total;
    @SerializedName("_links")
    @Expose
    private FollowLinks Links;

    /**
     * @return The follows
     */
    public List<Follower> getFollows() {
        return follows;
    }

    /**
     * @param follows The follows
     */
    public void setFollows(List<Follower> follows) {
        this.follows = follows;
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
     * @return The Links
     */
    public FollowLinks getLinks() {
        return Links;
    }

    /**
     * @param Links The _links
     */
    public void setLinks(FollowLinks Links) {
        this.Links = Links;
    }


    public class Follower {

        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("_links")
        @Expose
        private Links Links;
        @Expose
        private Boolean notifications;
        @Expose
        private TwitchUser user;

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
         * @return The Links
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
         * @return The notifications
         */
        public Boolean getNotifications() {
            return notifications;
        }

        /**
         * @param notifications The notifications
         */
        public void setNotifications(Boolean notifications) {
            this.notifications = notifications;
        }

        /**
         * @return The user
         */
        public TwitchUser getUser() {
            return user;
        }

        /**
         * @param user The user
         */
        public void setTwitchUser(TwitchUser user) {
            this.user = user;
        }

    }

    public class Links {

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

    public class UserLink {

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

    public class FollowLinks {

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
}
