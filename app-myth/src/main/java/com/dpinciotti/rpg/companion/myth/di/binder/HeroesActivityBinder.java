package com.dpinciotti.rpg.companion.myth.di.binder;

import com.dpinciotti.core.di.activity.ActivityComponentBuilder;
import com.dpinciotti.core.di.activity.ActivityKey;
import com.dpinciotti.rpg.companion.myth.heroes.HeroesActivity;
import com.dpinciotti.rpg.companion.myth.di.component.HeroesActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created by thepromoter on 1/30/17.
 */

@Module(subcomponents = {HeroesActivityComponent.class})
public abstract class HeroesActivityBinder {

    @Binds @IntoMap @ActivityKey(HeroesActivity.class)
    abstract ActivityComponentBuilder componentBuilder(HeroesActivityComponent.Builder builder);
}
