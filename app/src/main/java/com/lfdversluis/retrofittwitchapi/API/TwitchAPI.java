package com.lfdversluis.retrofittwitchapi.API;

import com.lfdversluis.retrofittwitchapi.models.TwitchUser;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

public interface TwitchAPI {

    @GET("/users/{user}")
    void getUserByName(
            @Path("user") String user, Callback<TwitchUser> cb);

    @GET("/users/{user}")
    void getUserByOauthHeader(
            @Path("user") Callback<TwitchUser> cb);



}
