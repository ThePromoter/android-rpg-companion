package com.dpinciotti.core.ui.di.binder;

import com.dpinciotti.core.di.activity.ActivityComponentBuilder;
import com.dpinciotti.core.di.activity.ActivityKey;
import com.dpinciotti.core.ui.base.activity.BaseActivity;
import com.dpinciotti.core.ui.di.component.BaseActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * @author dpinciotti
 * @createdDate 1/26/17
 */

@Module(subcomponents = {BaseActivityComponent.class})
public abstract class BaseActivityBinder {

    @Binds @IntoMap @ActivityKey(BaseActivity.class)
    abstract ActivityComponentBuilder componentBuilder(BaseActivityComponent.Builder builder);
}
