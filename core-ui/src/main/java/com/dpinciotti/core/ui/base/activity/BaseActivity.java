package com.dpinciotti.core.ui.base.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.dpinciotti.core.di.activity.ActivityComponentBuilderHost;
import com.dpinciotti.core.ui.di.component.BaseActivityComponent;
import com.dpinciotti.core.ui.di.module.BaseActivityModule;

import javax.inject.Inject;

import butterknife.ButterKnife;

/**
 * @author dpinciotti
 * @createdDate 1/25/17
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Inject ActivityLifecycleDelegate lifecycleDelegate;

    @Override protected void onCreate(Bundle savedInstanceState) {
        injectDependencies();
        super.onCreate(savedInstanceState);

        if (lifecycleDelegate == null) {
            injectBasicDependencies();
        }
        lifecycleDelegate.onCreate(savedInstanceState);
    }

    @Override protected void onDestroy() {
        super.onDestroy();
        lifecycleDelegate.onDestroy();
    }

    @Override protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        lifecycleDelegate.onSaveInstanceState(outState);
    }

    @Override protected void onPause() {
        super.onPause();
        lifecycleDelegate.onPause();
    }

    @Override protected void onResume() {
        super.onResume();
        lifecycleDelegate.onResume();
    }

    @Override protected void onStart() {
        super.onStart();
        lifecycleDelegate.onStart();
    }

    @Override protected void onStop() {
        super.onStop();
        lifecycleDelegate.onStop();
    }

    @Override protected void onRestart() {
        super.onRestart();
        lifecycleDelegate.onRestart();
    }

    @Override public void onContentChanged() {
        super.onContentChanged();
        ButterKnife.bind(this);
        lifecycleDelegate.onContentChanged();
    }

    private void injectBasicDependencies() {
        ((ActivityComponentBuilderHost) getApplication())
            .getActivityComponentBuilder(BaseActivity.class, BaseActivityComponent.Builder.class)
            .activityModule(new BaseActivityModule(this))
            .build()
            .inject(this);
    }

    protected abstract void injectDependencies();
}
