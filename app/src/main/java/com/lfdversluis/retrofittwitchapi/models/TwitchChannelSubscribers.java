package com.lfdversluis.retrofittwitchapi.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class TwitchChannelSubscribers {

    @SerializedName("_total")
    @Expose
    private Integer Total;
    @SerializedName("_links")
    @Expose
    private Links Links;
    @Expose
    private List<Subscription> subscriptions = new ArrayList<>();

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
     * @return The subscriptions
     */
    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    /**
     * @param subscriptions The subscriptions
     */
    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }


    public class Links {

        @Expose
        private String next;
        @Expose
        private String self;

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

    public class UserLinks {

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

    public class SubscriptionLinks {

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

    public class Subscription {

        @SerializedName("_id")
        @Expose
        private String Id;
        @Expose
        private User user;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("_links")
        @Expose
        private SubscriptionLinks Links;

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
         * @return The user
         */
        public User getUser() {
            return user;
        }

        /**
         * @param user The user
         */
        public void setUser(User user) {
            this.user = user;
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
         * @return The Links
         */
        public SubscriptionLinks getLinks() {
            return Links;
        }

        /**
         * @param Links The _links
         */
        public void setLinks(SubscriptionLinks Links) {
            this.Links = Links;
        }

    }

    public class User {

        @SerializedName("_id")
        @Expose
        private String Id;
        @Expose
        private Object logo;
        @Expose
        private String type;
        @Expose
        private String bio;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @Expose
        private String name;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;
        @SerializedName("display_name")
        @Expose
        private String displayName;
        @SerializedName("_links")
        @Expose
        private UserLinks Links;

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
         * @return The logo
         */
        public Object getLogo() {
            return logo;
        }

        /**
         * @param logo The logo
         */
        public void setLogo(Object logo) {
            this.logo = logo;
        }

        /**
         * @return The type
         */
        public String getType() {
            return type;
        }

        /**
         * @param type The type
         */
        public void setType(String type) {
            this.type = type;
        }

        /**
         * @return The bio
         */
        public String getBio() {
            return bio;
        }

        /**
         * @param bio The bio
         */
        public void setBio(String bio) {
            this.bio = bio;
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
         * @return The Links
         */
        public UserLinks getLinks() {
            return Links;
        }

        /**
         * @param Links The _links
         */
        public void setLinks(UserLinks Links) {
            this.Links = Links;
        }

    }
}

