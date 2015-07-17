package com.lfdversluis.retrofittwitchapi;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.lfdversluis.retrofittwitchapi.API.TwitchAPI;
import com.lfdversluis.retrofittwitchapi.models.TwitchUser;

import retrofit.Callback;
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

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("https://api.twitch.tv/kraken")
                .build();

        TwitchAPI api = restAdapter.create(TwitchAPI.class);
        api.getUserByName("cookieandegg", new Callback<TwitchUser>() {
            @Override
            public void success(TwitchUser user, Response response) {
                Log.e(LOG_TAG, user.getLogo());

            }

            @Override
            public void failure(RetrofitError error) {
                // TODO error
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
