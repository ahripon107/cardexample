package com.therap.amin.demorecyclerview;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by amin on 6/16/16.
 */
public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
