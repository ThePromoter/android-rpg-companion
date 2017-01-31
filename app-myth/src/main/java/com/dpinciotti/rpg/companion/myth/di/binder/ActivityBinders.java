package com.dpinciotti.rpg.companion.myth.di.binder;

import com.dpinciotti.core.ui.di.binder.BaseActivityBinder;

import dagger.Module;

/**
 * Created by thepromoter on 1/30/17.
 */

@Module(includes = {
    BaseActivityBinder.class,
    HeroesActivityBinder.class
})
public abstract class ActivityBinders {}
