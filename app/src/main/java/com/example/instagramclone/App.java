package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("9slFB9MbEfoPXXYpqlBG7Q1Ezf28Qg6WM0JclWoJ")
                // if defined
                .clientKey("YiVHrSHtpd0rH6A3HW2SwfcVnOYhU4UKLVCQhkG4")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
