package com.dpinciotti.core.ui.di.binder;

import com.dpinciotti.core.di.activity.ActivityComponentBuilder;
import com.dpinciotti.core.di.activity.ActivityKey;
import com.dpinciotti.core.di.fragment.FragmentComponentBuilder;
import com.dpinciotti.core.di.fragment.FragmentKey;
import com.dpinciotti.core.ui.base.activity.BaseActivity;
import com.dpinciotti.core.ui.base.fragment.BaseFragment;
import com.dpinciotti.core.ui.di.component.BaseActivityComponent;
import com.dpinciotti.core.ui.di.component.BaseFragmentComponent;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * @author dpinciotti
 * @createdDate 1/26/17
 */

@Module(subcomponents = {BaseFragmentComponent.class})
public abstract class BaseFragmentBinder {

    @Binds @IntoMap @FragmentKey(BaseFragment.class)
    abstract FragmentComponentBuilder componentBuilder(BaseFragmentComponent.Builder builder);
}
