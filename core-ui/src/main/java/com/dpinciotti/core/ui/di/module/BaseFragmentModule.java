package com.dpinciotti.core.ui.di.module;

import android.app.Activity;
import android.support.v4.app.Fragment;

import com.dpinciotti.core.di.activity.ActivityBaseModule;
import com.dpinciotti.core.di.fragment.FragmentBaseModule;
import com.dpinciotti.core.di.fragment.FragmentName;
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
public class BaseFragmentModule extends FragmentBaseModule {

    public BaseFragmentModule(Fragment fragment) {
        super(fragment);
    }

    @Provides @ActivityScope
    public ActivityLifecycleDelegate provideActivityLifecycleDelegate(@FragmentName String name) {
        return new ActivityLifecycleLogger(name);
    }
}
