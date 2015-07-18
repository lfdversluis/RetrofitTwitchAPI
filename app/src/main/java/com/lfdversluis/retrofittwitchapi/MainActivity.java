package com.lfdversluis.retrofittwitchapi;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.lfdversluis.retrofittwitchapi.API.TwitchAPI;
import com.lfdversluis.retrofittwitchapi.models.TwitchChannel;
import com.lfdversluis.retrofittwitchapi.models.TwitchUser;

import retrofit.Callback;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MainActivity extends Activity {

    private final String LOG_TAG = "MainActivity";

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
                request.addHeader("Client-ID", "<Client ID>");
            }
        };

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("https://api.twitch.tv/kraken")
                .setRequestInterceptor(requestInterceptor)
                .build();

        TwitchAPI api = restAdapter.create(TwitchAPI.class);

        /********************************************************************
         * TWITCH USER EXAMPLE
         *******************************************************************/

        api.getUserByName("cookieandegg", new Callback<TwitchUser>() {
            @Override
            public void success(TwitchUser user, Response response) {
                Log.e(LOG_TAG, user.getName()+""); //
                // Some items can be null if queried by getUserByName (not authenticated)!
                Log.e(LOG_TAG, user.getNotifications()+""); //
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e(LOG_TAG, "FAILED: " + error.toString());
            }
        });

        /********************************************************************
         * TWITCH CHANNEL EXAMPLE
         *******************************************************************/

        api.getChannelByName("cookieandegg", new Callback<TwitchChannel>() {
            @Override
            public void success(TwitchChannel channel, Response response) {
                Log.e(LOG_TAG, channel.getStatus());

                // Some items can be null (not present) when you do an unauthenticated call:
                // Differences in the returns can be observed at https://github.com/justintv/Twitch-API/blob/master/v3_resources/channels.md
                Log.e(LOG_TAG, channel.getStreamKey()+"");
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e(LOG_TAG, "FAILED: " + error.toString());
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
