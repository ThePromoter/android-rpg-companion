package com.dpinciotti.core.di.activity;

import android.app.Activity;

import com.dpinciotti.core.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * @author dpinciotti
 * @createdDate 1/26/17
 */

@Module
public abstract class ActivityBaseModule {

    protected Activity activity;

    public ActivityBaseModule(Activity activity) {
        this.activity = activity;
    }

    @Provides @ActivityScope @ActivityName
    public String provideActivityName() {
        return activity.getClass().getSimpleName();
    }
}