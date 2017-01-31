package com.dpinciotti.core.ui.base.activity;

import android.os.Bundle;

import timber.log.Timber;

/**
 * @author dpinciotti
 * @createdDate 1/25/17
 */

public class ActivityLifecycleLogger implements ActivityLifecycleDelegate {

    protected String className;

    public ActivityLifecycleLogger(String className) {
        this.className = className;
    }

    @Override public void onCreate(Bundle bundle) {
        Timber.v("onCreate: %s", className);
    }

    @Override public void onDestroy() {
        Timber.v("onDestroy: %s", className);
    }

    @Override public void onSaveInstanceState(Bundle outState) {
        Timber.v("onSaveInstanceState: %s", className);
    }

    @Override public void onPause() {
        Timber.v("onPause: %s", className);
    }

    @Override public void onResume() {
        Timber.v("onResume: %s", className);
    }

    @Override public void onStart() {
        Timber.v("onStart: %s", className);
    }

    @Override public void onStop() {
        Timber.v("onStop: %s", className);
    }

    @Override public void onRestart() {
        Timber.v("onRestart: %s", className);
    }

    @Override public void onContentChanged() {
        Timber.v("onContentChanged: %s", className);
    }
}
