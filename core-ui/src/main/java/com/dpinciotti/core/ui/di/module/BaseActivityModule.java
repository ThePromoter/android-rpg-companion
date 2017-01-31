package com.dpinciotti.core.ui.di.module;

import android.app.Activity;

import com.dpinciotti.core.di.activity.ActivityBaseModule;
import com.dpinciotti.core.di.activity.ActivityName;
import com.dpinciotti.core.di.scope.ActivityScope;
import com.dpinciotti.core.ui.base.activity.ActivityLifecycleDelegate;
import com.dpinciotti.core.ui.base.activity.ActivityLifecycleLogger;

import dagger.Module;
import dagger.Provides;

/**
 * @author dpinciotti
 * @createdDate 1/25/17
 */

@Module
public class BaseActivityModule extends ActivityBaseModule {

    public BaseActivityModule(Activity activity) {
        super(activity);
    }

    @Provides @ActivityScope
    public ActivityLifecycleDelegate provideActivityLifecycleDelegate(@ActivityName String name) {
        return new ActivityLifecycleLogger(name);
    }
}
