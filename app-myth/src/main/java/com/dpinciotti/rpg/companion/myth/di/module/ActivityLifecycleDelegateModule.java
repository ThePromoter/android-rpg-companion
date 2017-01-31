package com.dpinciotti.rpg.companion.myth.di.module;

import com.dpinciotti.core.di.activity.ActivityName;
import com.dpinciotti.core.di.scope.ActivityScope;
import com.dpinciotti.core.ui.base.activity.ActivityLifecycleDelegate;
import com.dpinciotti.rpg.companion.myth.AnalyticsActivityLifecycleDelegate;

import dagger.Module;
import dagger.Provides;

/**
 * Created by thepromoter on 1/30/17.
 */

@Module
public class ActivityLifecycleDelegateModule {

    @Provides @ActivityScope
    public ActivityLifecycleDelegate provideActivityLifecycleDelegate(
        @ActivityName String activityName) {

        return new AnalyticsActivityLifecycleDelegate(activityName);
    }
}
