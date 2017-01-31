package com.dpinciotti.rpg.companion.myth.di.module;

import android.support.v4.app.Fragment;

import com.dpinciotti.core.di.fragment.FragmentBaseModule;

import dagger.Module;

/**
 * Created by thepromoter on 1/30/17.
 */

@Module(includes = {FragmentLifecycleDelegateModule.class})
public class HeroesFragmentModule extends FragmentBaseModule {

    public HeroesFragmentModule(Fragment fragment) {
        super(fragment);
    }
}
