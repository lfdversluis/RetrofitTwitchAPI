package com.lfdversluis.retrofittwitchapi.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class TwitchBlockedUsers {

    @SerializedName("_links")
    @Expose
    private Links Links;
    @Expose
    private List<Block> blocks = new ArrayList<>();

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
     * @return The blocks
     */
    public List<Block> getBlocks() {
        return blocks;
    }

    /**
     * @param blocks The blocks
     */
    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }

    public class Block {

        @SerializedName("_id")
        @Expose
        private Long Id;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;
        @SerializedName("_links")
        @Expose
        private BlockLinks Links;
        @Expose
        private User user;

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
         * @return The Links
         */
        public BlockLinks getLinks() {
            return Links;
        }

        /**
         * @param Links The _links
         */
        public void setLinks(BlockLinks Links) {
            this.Links = Links;
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

    public class BlockLinks {

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

    public class User {

        @SerializedName("display_name")
        @Expose
        private String displayName;
        @SerializedName("_id")
        @Expose
        private Long Id;
        @Expose
        private String name;
        @Expose
        private Boolean staff;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;
        @Expose
        private Object logo;
        @SerializedName("_links")
        @Expose
        private UserLinks Links;

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
         * @return The staff
         */
        public Boolean getStaff() {
            return staff;
        }

        /**
         * @param staff The staff
         */
        public void setStaff(Boolean staff) {
            this.staff = staff;
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
