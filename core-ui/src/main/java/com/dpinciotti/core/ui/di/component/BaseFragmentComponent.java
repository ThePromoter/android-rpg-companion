package com.dpinciotti.core.ui.di.component;

import com.dpinciotti.core.di.PlainComponent;
import com.dpinciotti.core.di.activity.ActivityComponentBuilder;
import com.dpinciotti.core.di.fragment.FragmentComponentBuilder;
import com.dpinciotti.core.di.scope.ActivityScope;
import com.dpinciotti.core.ui.base.activity.BaseActivity;
import com.dpinciotti.core.ui.base.fragment.BaseFragment;
import com.dpinciotti.core.ui.di.module.BaseActivityModule;
import com.dpinciotti.core.ui.di.module.BaseFragmentModule;

import dagger.Subcomponent;

/**
 * @author dpinciotti
 * @createdDate 1/25/17
 */

@ActivityScope
@Subcomponent(modules = {BaseFragmentModule.class})
public interface BaseFragmentComponent extends PlainComponent<BaseFragment> {

    @Subcomponent.Builder
    interface Builder extends FragmentComponentBuilder<BaseFragment, BaseFragmentComponent> {
        Builder fragmentModule(BaseFragmentModule module);
    }
}
