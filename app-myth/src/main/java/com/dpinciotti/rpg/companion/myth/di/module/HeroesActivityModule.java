package com.dpinciotti.rpg.companion.myth.di.module;

import android.app.Activity;

import com.dpinciotti.core.di.activity.ActivityBaseModule;

import dagger.Module;

/**
 * Created by thepromoter on 1/30/17.
 */

@Module(includes = {ActivityLifecycleDelegateModule.class})
public class HeroesActivityModule extends ActivityBaseModule {

    public HeroesActivityModule(Activity activity) {
        super(activity);
    }
}
