package com.dpinciotti.rpg.companion.myth.di.binder;

import com.dpinciotti.core.di.fragment.FragmentComponentBuilder;
import com.dpinciotti.core.di.fragment.FragmentKey;
import com.dpinciotti.rpg.companion.myth.di.component.HeroesFragmentComponent;
import com.dpinciotti.rpg.companion.myth.heroes.HeroesFragment;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created by thepromoter on 1/30/17.
 */

@Module(subcomponents = {HeroesFragmentComponent.class})
public abstract class HeroesFragmentBinder {

    @Binds @IntoMap @FragmentKey(HeroesFragment.class)
    abstract FragmentComponentBuilder componentBuilder(HeroesFragmentComponent.Builder builder);
}
