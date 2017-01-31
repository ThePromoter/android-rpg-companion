package com.dpinciotti.rpg.companion.myth.di.component;

import com.dpinciotti.core.di.PlainComponent;
import com.dpinciotti.core.di.activity.ActivityComponentBuilder;
import com.dpinciotti.core.di.scope.ActivityScope;
import com.dpinciotti.rpg.companion.myth.di.binder.HeroesActivityFragmentBinders;
import com.dpinciotti.rpg.companion.myth.heroes.HeroesActivity;
import com.dpinciotti.rpg.companion.myth.di.module.HeroesActivityModule;

import dagger.Subcomponent;

/**
 * Created by thepromoter on 1/30/17.
 */

@ActivityScope
@Subcomponent(modules= {
    HeroesActivityModule.class,
    HeroesActivityFragmentBinders.class
})
public interface HeroesActivityComponent extends PlainComponent<HeroesActivity> {

    @Subcomponent.Builder
    interface Builder extends ActivityComponentBuilder<HeroesActivity, HeroesActivityComponent> {
        Builder activityModule(HeroesActivityModule module);
    }
}
