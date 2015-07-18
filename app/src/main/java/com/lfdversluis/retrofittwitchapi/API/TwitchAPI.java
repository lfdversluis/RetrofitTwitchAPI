package com.lfdversluis.retrofittwitchapi.API;

import com.lfdversluis.retrofittwitchapi.Models.TwitchChannel;
import com.lfdversluis.retrofittwitchapi.Models.TwitchChannelFollowers;
import com.lfdversluis.retrofittwitchapi.Models.TwitchUser;
import com.lfdversluis.retrofittwitchapi.Util.TypedJSONString;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Path;
import retrofit.http.Query;

public interface TwitchAPI {

    @GET("/users/{user}")
    void getUserByName(
            @Path("user") String user,
            Callback<TwitchUser> cb
    );

    @GET("/user")
    void getUserByOauthToken(
            @Query("oauth_token") String OAuthToken,
            Callback<TwitchUser> cb
    );

    @GET("/channels/{channel}")
    void getChannelByName(
            @Path("channel") String channelName,
            Callback<TwitchChannel> cb
    );

    @GET("/channel")
    void getChannelByOauthToken(
            @Query("oauth_token") String OAuthToken,
            Callback<TwitchChannel> cb
    );

    @PUT("/channels/{channel}")
    void updateChannel(
            @Query("oauth_token") String OAuthToken,
            @Path("channel") String channel,
            @Body TypedJSONString body,
            Callback<TwitchChannel> cb
    );

    @GET("/channels/{channel}/follows")
    void getChannelFollowers(
            @Path("channel") String channel,
            @Query("limit") int limit,
            @Query("offset") int offset,
            @Query("direction") String direction,
            Callback<TwitchChannelFollowers> cb
    );

}
