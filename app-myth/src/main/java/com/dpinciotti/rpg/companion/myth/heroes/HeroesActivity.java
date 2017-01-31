package com.dpinciotti.rpg.companion.myth.heroes;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.dpinciotti.core.di.PlainComponent;
import com.dpinciotti.core.di.activity.ActivityComponentBuilderHost;
import com.dpinciotti.core.di.fragment.FragmentComponentBuilder;
import com.dpinciotti.core.di.fragment.FragmentComponentBuilderHost;
import com.dpinciotti.core.ui.base.activity.BaseActivity;
import com.dpinciotti.rpg.companion.myth.R;
import com.dpinciotti.rpg.companion.myth.di.component.HeroesActivityComponent;
import com.dpinciotti.rpg.companion.myth.di.module.HeroesActivityModule;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Provider;

public class HeroesActivity extends BaseActivity implements FragmentComponentBuilderHost {

    HeroesActivityComponent component;

    @Inject Map<Class<? extends Fragment>, Provider<FragmentComponentBuilder>> fragmentComponentBuilderMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes);
    }

    @Override protected void injectDependencies() {
        component = ((ActivityComponentBuilderHost) getApplication())
            .getActivityComponentBuilder(HeroesActivity.class, HeroesActivityComponent.Builder.class)
            .activityModule(new HeroesActivityModule(this))
            .build();
        component.inject(this);
    }

    @Override
    public <A extends Fragment, B extends FragmentComponentBuilder<A, ? extends PlainComponent<A>>>
    B getFragmentComponentBuilder(Class<A> fragmentKey, Class<B> builderType) {
        return builderType.cast(fragmentComponentBuilderMap.get(fragmentKey).get());
    }
}
