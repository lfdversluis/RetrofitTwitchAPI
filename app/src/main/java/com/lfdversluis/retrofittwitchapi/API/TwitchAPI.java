package com.lfdversluis.retrofittwitchapi.API;

import com.lfdversluis.retrofittwitchapi.models.TwitchUser;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Headers;
import retrofit.http.Path;
import retrofit.http.Query;

public interface TwitchAPI {

    @GET("/users/{user}")
    void getUserByName(
            @Path("user") String user, Callback<TwitchUser> cb);

    @GET("/user")
    void getUserByOauthToken(
            @Query("oauth_token") String token,
            Callback<TwitchUser> cb);



}
