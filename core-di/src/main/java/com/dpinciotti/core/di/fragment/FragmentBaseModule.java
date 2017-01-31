package com.dpinciotti.core.di.fragment;

import android.app.Activity;
import android.support.v4.app.Fragment;

import com.dpinciotti.core.di.activity.ActivityName;
import com.dpinciotti.core.di.scope.ActivityScope;
import com.dpinciotti.core.di.scope.FragmentScope;

import dagger.Module;
import dagger.Provides;

/**
 * @author dpinciotti
 * @createdDate 1/26/17
 */

@Module
public abstract class FragmentBaseModule {

    protected Fragment fragment;

    public FragmentBaseModule(Fragment fragment) {
        this.fragment = fragment;
    }

    @Provides @FragmentScope @FragmentName
    public String provideFragmentName() {
        return fragment.getClass().getSimpleName();
    }
}