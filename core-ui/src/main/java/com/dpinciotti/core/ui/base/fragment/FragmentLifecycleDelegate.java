package com.dpinciotti.core.ui.base.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author dpinciotti
 * @createdDate 1/25/17
 */

public interface FragmentLifecycleDelegate {

    /**
     * This method must be called from {@link Fragment#onCreate(Bundle)}
     */
    void onCreate(Bundle bundle);

    /**
     * This method must be called from {@link Fragment#onDestroy()}
     */
    void onDestroy();

    /**
     * This method must be called from {@link Fragment#onCreateView(LayoutInflater, ViewGroup, Bundle)}
     */
    void onCreateView(LayoutInflater inflater,
                      @Nullable ViewGroup container,
                      @Nullable Bundle savedInstanceState);

    /**
     * This method must be called from {@link Fragment#onViewCreated(View, Bundle)}
     */
    void onViewCreated(View view, @Nullable Bundle savedInstanceState);

    /**
     * This method must be called from {@link Fragment#onDestroyView()}
     */
    void onDestroyView();

    /**
     * This method must be called from {@link Fragment#onSaveInstanceState(Bundle)}
     */
    void onSaveInstanceState(Bundle outState);

    /**
     * This method must be called from {@link Fragment#onStart()}
     */
    void onStart();

    /**
     * This method must be called from {@link Fragment#onStop()}
     */
    void onStop();

    /**
     * This method must be called from {@link Fragment#onPause()}
     */
    void onPause();

    /**
     * This method must be called from {@link Fragment#onResume()}
     */
    void onResume();

    /**
     * This method must be called from {@link Fragment#onDetach()}
     */
    void onDetach();
}