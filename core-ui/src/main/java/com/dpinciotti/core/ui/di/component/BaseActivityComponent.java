package com.dpinciotti.core.ui.di.component;

import com.dpinciotti.core.di.PlainComponent;
import com.dpinciotti.core.di.activity.ActivityComponentBuilder;
import com.dpinciotti.core.di.scope.ActivityScope;
import com.dpinciotti.core.ui.base.activity.BaseActivity;
import com.dpinciotti.core.ui.di.module.BaseActivityModule;

import dagger.Subcomponent;

/**
 * @author dpinciotti
 * @createdDate 1/25/17
 */

@ActivityScope
@Subcomponent(modules = {BaseActivityModule.class})
public interface BaseActivityComponent extends PlainComponent<BaseActivity> {

    @Subcomponent.Builder
    interface Builder extends ActivityComponentBuilder<BaseActivity, BaseActivityComponent> {
        Builder activityModule(BaseActivityModule module);
    }
}
