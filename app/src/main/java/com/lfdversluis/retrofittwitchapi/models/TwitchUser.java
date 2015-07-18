package com.lfdversluis.retrofittwitchapi.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TwitchUser {

    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("_id")
    @Expose
    private Integer Id;
    @Expose
    private String name;
    @Expose
    private String type;
    @Expose
    private Object bio;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @Expose
    private String logo;
    @SerializedName("_links")
    @Expose
    private Links Links;
    @Expose
    private String email;
    @Expose
    private Boolean partnered;
    @Expose
    private Notifications notifications;

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
    public Object getBio() {
        return bio;
    }

    /**
     * @param bio The bio
     */
    public void setBio(Object bio) {
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
     * @return The partnered
     */
    public Boolean getPartnered() {
        return partnered;
    }

    /**
     * @param partnered The partnered
     */
    public void setPartnered(Boolean partnered) {
        this.partnered = partnered;
    }

    /**
     * @return The notifications
     */
    public Notifications getNotifications() {
        return notifications;
    }

    /**
     * @param notifications The notifications
     */
    public void setNotifications(Notifications notifications) {
        this.notifications = notifications;
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

    public class Notifications {

        @Expose
        private Boolean push;
        @Expose
        private Boolean email;

        /**
         * @return The push
         */
        public Boolean getPush() {
            return push;
        }

        /**
         * @param push The push
         */
        public void setPush(Boolean push) {
            this.push = push;
        }

        /**
         * @return The email
         */
        public Boolean getEmail() {
            return email;
        }

        /**
         * @param email The email
         */
        public void setEmail(Boolean email) {
            this.email = email;
        }

    }
}