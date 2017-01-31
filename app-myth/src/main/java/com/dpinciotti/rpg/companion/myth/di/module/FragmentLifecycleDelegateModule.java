package com.dpinciotti.rpg.companion.myth.di.module;

import com.dpinciotti.core.di.fragment.FragmentName;
import com.dpinciotti.core.di.scope.ActivityScope;
import com.dpinciotti.core.di.scope.FragmentScope;
import com.dpinciotti.core.ui.base.fragment.FragmentLifecycleDelegate;
import com.dpinciotti.rpg.companion.myth.AnalyticsFragmentLifecycleDelegate;

import dagger.Module;
import dagger.Provides;

/**
 * Created by thepromoter on 1/30/17.
 */

@Module
public class FragmentLifecycleDelegateModule {

    @Provides @FragmentScope
    public FragmentLifecycleDelegate provideFragmentLifecycleDelegate(
        @FragmentName String fragmentName) {

        return new AnalyticsFragmentLifecycleDelegate(fragmentName);
    }
}
