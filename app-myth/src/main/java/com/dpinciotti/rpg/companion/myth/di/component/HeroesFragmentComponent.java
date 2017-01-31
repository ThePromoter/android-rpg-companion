package com.dpinciotti.rpg.companion.myth.di.component;

import com.dpinciotti.core.di.PlainComponent;
import com.dpinciotti.core.di.fragment.FragmentComponentBuilder;
import com.dpinciotti.core.di.scope.FragmentScope;
import com.dpinciotti.rpg.companion.myth.di.module.HeroesFragmentModule;
import com.dpinciotti.rpg.companion.myth.heroes.HeroesFragment;

import dagger.Subcomponent;

/**
 * Created by thepromoter on 1/30/17.
 */

@FragmentScope
@Subcomponent(modules= {
    HeroesFragmentModule.class
})
public interface HeroesFragmentComponent extends PlainComponent<HeroesFragment> {

    @Subcomponent.Builder
    interface Builder extends FragmentComponentBuilder<HeroesFragment, HeroesFragmentComponent> {
        Builder fragmentModule(HeroesFragmentModule module);
    }
}
