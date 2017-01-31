package com.dpinciotti.rpg.companion.myth.heroes;

import com.dpinciotti.core.di.fragment.FragmentComponentBuilderHost;
import com.dpinciotti.core.ui.base.fragment.BaseFragment;
import com.dpinciotti.rpg.companion.myth.R;
import com.dpinciotti.rpg.companion.myth.di.component.HeroesFragmentComponent;
import com.dpinciotti.rpg.companion.myth.di.module.HeroesFragmentModule;

/**
 * Created by thepromoter on 1/30/17.
 */

public class HeroesFragment extends BaseFragment {

    HeroesFragmentComponent component;

    @Override protected int getLayoutRes() {
        return R.layout.fragment_heroes;
    }

    @Override protected void injectDependencies() {
        component = ((FragmentComponentBuilderHost) getActivity())
            .getFragmentComponentBuilder(HeroesFragment.class, HeroesFragmentComponent.Builder.class)
            .fragmentModule(new HeroesFragmentModule(this))
            .build();
        component.inject(this);
    }
}
