package com.lfdversluis.retrofittwitchapi.API;

import com.lfdversluis.retrofittwitchapi.Models.TwitchChannel;
import com.lfdversluis.retrofittwitchapi.Models.TwitchChannelFollowers;
import com.lfdversluis.retrofittwitchapi.Models.TwitchChannelVideos;
import com.lfdversluis.retrofittwitchapi.Models.TwitchFollowedChannels;
import com.lfdversluis.retrofittwitchapi.Models.TwitchFollowedStreams;
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

    @GET("/channels/{channel}/videos")
    void getChannelVideos(
            @Path("channel") String channel,
            @Query("limit") int limit,
            @Query("offset") int offset,
            @Query("broadcasts") boolean broadcasts,
            @Query("hls") boolean hls,
            // Not documented in the API, can be all, archive or highlight
            // see http://discuss.dev.twitch.tv/t/is-it-possible-to-get-all-vods-in-one-call/2588
            @Query("broadcast_type") String broadcastType,
            Callback<TwitchChannelVideos> cb
    );

    @GET("/streams/followed")
    void getFollowedStreams(
            @Query("oauth_token") String OAuthToken,
            @Query("limit") int limit,
            @Query("offset") int offset,
            Callback<TwitchFollowedStreams> cb
    );

    @GET("/users/{user}/follows/channels")
    void getFollowedChannels(
            @Path("user") String user,
            @Query("limit") int limit,
            @Query("offset") int offset,
            @Query("direction") String direction,
            @Query("sortby") String sortBy,
            Callback<TwitchFollowedChannels> cb
    );

}
