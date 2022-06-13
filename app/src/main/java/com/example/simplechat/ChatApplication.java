package com.example.simplechat;
import android.app.Application;
import android.content.res.Configuration;

import com.parse.Parse;
import com.parse.ParseObject;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;


public class ChatApplication extends Application{

    // Called when the application is starting, before any other application objects have been created.
    // Overriding this method is totally optional!
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Message.class);

        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("BgMeRhXN4Mfsr4iu7cg2PJPITPJgn9T4meopyWPG") // provided in Lab instructions
                .clientKey("r6fZMD0BL8dZx0pVlYemVJbHwqaBtIRqO19SX40c") // provided in Lab instructions
                .clientBuilder(builder)
                .server("https://parseapi.back4app.com/").build());  // provided in Lab instructions
    }

    // Called by the system when the device configuration changes while your component is running.
    // Overriding this method is totally optional!
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    // This is called when the overall system is running low on memory,
    // and would like actively running processes to tighten their belts.
    // Overriding this method is totally optional!
    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }
}
