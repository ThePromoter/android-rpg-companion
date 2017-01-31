package com.dpinciotti.core.ui.base.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import timber.log.Timber;

/**
 * Created by thepromoter on 1/30/17.
 */

public class FragmentLifecycleLogger implements FragmentLifecycleDelegate {

    protected String className;

    public FragmentLifecycleLogger(String className) {
        this.className = className;
    }

    @Override public void onCreate(Bundle bundle) {
        Timber.v("onCreate: %s", className);
    }

    @Override public void onDestroy() {
        Timber.v("onDestroy: %s", className);
    }

    @Override public void onCreateView(LayoutInflater inflater,
                                       @Nullable ViewGroup container,
                                       @Nullable Bundle savedInstanceState) {
        Timber.v("onCreateView: %s", className);
    }

    @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Timber.v("onViewCreated: %s", className);
    }

    @Override public void onDestroyView() {
        Timber.v("onDestroyView: %s", className);
    }

    @Override public void onSaveInstanceState(Bundle outState) {
        Timber.v("onSaveInstanceState: %s", className);
    }

    @Override public void onStart() {
        Timber.v("onStart: %s", className);
    }

    @Override public void onStop() {
        Timber.v("onStop: %s", className);
    }

    @Override public void onPause() {
        Timber.v("onPause: %s", className);
    }

    @Override public void onResume() {
        Timber.v("onResume: %s", className);
    }

    @Override public void onDetach() {
        Timber.v("onDetach: %s", className);
    }
}
