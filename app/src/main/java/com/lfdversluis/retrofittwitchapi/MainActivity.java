package com.lfdversluis.retrofittwitchapi;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.lfdversluis.retrofittwitchapi.API.TwitchAPI;
import com.lfdversluis.retrofittwitchapi.Models.TwitchChannel;
import com.lfdversluis.retrofittwitchapi.Models.TwitchChannelFollowers;
import com.lfdversluis.retrofittwitchapi.Models.TwitchChannelVideos;
import com.lfdversluis.retrofittwitchapi.Models.TwitchFollowedChannels;
import com.lfdversluis.retrofittwitchapi.Models.TwitchFollowedStreams;
import com.lfdversluis.retrofittwitchapi.Models.TwitchUser;
import com.lfdversluis.retrofittwitchapi.Util.TypedJSONString;

import org.json.JSONException;
import org.json.JSONObject;

import retrofit.Callback;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MainActivity extends Activity {

    private final String LOG_TAG = "MainActivity";
    private final String OauthToken = "";
    private final String clientId = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onStart(){
        super.onStart();

        RequestInterceptor requestInterceptor = new RequestInterceptor() {
            @Override
            public void intercept(RequestFacade request) {
                request.addHeader("Accept", "application/vnd.twitchtv.v3+json");
                request.addHeader("Client-ID", clientId);
            }
        };

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("https://api.twitch.tv/kraken")
                .setRequestInterceptor(requestInterceptor)
               /* .setLogLevel(RestAdapter.LogLevel.FULL).setLog(new RestAdapter.Log() {
                    public void log(String msg) {
                        Log.i("retrofit", msg);
                    }
                }) */
                .build();

        TwitchAPI api = restAdapter.create(TwitchAPI.class);

        /********************************************************************
         * TWITCH USER EXAMPLE
         *******************************************************************/

        api.getUserByName("cookieandegg", new Callback<TwitchUser>() {
            @Override
            public void success(TwitchUser user, Response response) {
                Log.e("getUserByName ex.", user.getName()+""); //
                // Some items can be null if queried by getUserByName (not authenticated)!
                Log.e("getUserByName ex.", user.getNotifications()+""); //
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e("getUserByName ex.", "FAILED: " + error.toString());
            }
        });


        /********************************************************************
         * TWITCH CHANNEL EXAMPLE
         *******************************************************************/

        api.getChannelByName("cookieandegg", new Callback<TwitchChannel>() {
            @Override
            public void success(TwitchChannel channel, Response response) {
                Log.e("getChannelByName ex.", channel.getStatus());

                // Some items can be null (not present) when you do an unauthenticated call:
                // Differences in the returns can be observed at https://github.com/justintv/Twitch-API/blob/master/v3_resources/channels.md
                Log.e("getChannelByName ex.", channel.getStreamKey()+"");
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e("getChannelByName ex.", "FAILED: " + error.toString());
            }
        });

        // update example

        final JSONObject updateObject = new JSONObject();
        JSONObject channelObject = new JSONObject();
        try {
            channelObject.put("status", "Awesome Test Title");
            channelObject.put("game", "Counter-Strike: Global Offensive");
            channelObject.put("delay", 0);
            updateObject.put("channel", channelObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }


        api.updateChannel(OauthToken, "cookieandegg", new TypedJSONString(updateObject.toString()), new Callback<TwitchChannel>() {
            @Override
            public void success(TwitchChannel channel, Response response) {
                Log.e("Update channel ex.", "Success");
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e("Update channel ex.", "FAILED: " + error.toString());
            }
        });

        /********************************************************************
         * STREAM FOLLOWERS EXAMPLE
         *******************************************************************/

        api.getChannelFollowers("cookieandegg", 2, 0, "desc", new Callback<TwitchChannelFollowers>() {
            @Override
            public void success(TwitchChannelFollowers followers, Response response) {
                Log.e("Channel followers ex.", followers.getTotal()+"");
                for(TwitchChannelFollowers.Follower follower : followers.getFollows()){
                    Log.e("Channel followers ex.", follower.getUser().getName());
                }
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e("Channel followers ex.", error.toString());
            }
        });


        /********************************************************************
         * CHANNEL VIDEOS EXAMPLE
         *******************************************************************/

        api.getChannelVideos("amazhs", 2, 0, false, false, "all", new Callback<TwitchChannelVideos>() {
            @Override
            public void success(TwitchChannelVideos videos, Response response) {
                for(TwitchChannelVideos.Video video : videos.getVideos()){
                    Log.e("Channel vid ex.", video.getTitle());
                }
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e("Channel vid ex.", error.toString());
            }
        });


        /********************************************************************
         * FOLLOWED STREAMS EXAMPLE
         *******************************************************************/

        api.getFollowedStreams(OauthToken, 2, 0, new Callback<TwitchFollowedStreams>() {
            @Override
            public void success(TwitchFollowedStreams streams, Response response) {
                for(TwitchFollowedStreams.Stream stream : streams.getStreams()){
                    Log.e("Followed streams ex.", stream.getChannel().getStatus());
                }
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e("Followed streams ex.", error.toString());
            }
        });


        /********************************************************************
         * FOLLOWED CHANNELS EXAMPLE
         *******************************************************************/

        api.getFollowedChannels("cookieandegg", 2, 0, "desc", "created_at", new Callback<TwitchFollowedChannels>() {
            @Override
            public void success(TwitchFollowedChannels channels, Response response) {
                for(TwitchFollowedChannels.Follow follow : channels.getFollows()){
                    Log.e("Followed channel ex.", follow.getChannel().getStatus());
                }
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e("Followed channel ex.", error.toString());
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
