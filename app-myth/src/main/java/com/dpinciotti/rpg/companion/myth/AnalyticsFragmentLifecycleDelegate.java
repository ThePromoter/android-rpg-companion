package com.dpinciotti.rpg.companion.myth;

import android.os.Bundle;

import com.dpinciotti.core.ui.base.activity.ActivityLifecycleLogger;
import com.dpinciotti.core.ui.base.fragment.FragmentLifecycleDelegate;
import com.dpinciotti.core.ui.base.fragment.FragmentLifecycleLogger;

/**
 * Created by thepromoter on 1/30/17.
 */

public class AnalyticsFragmentLifecycleDelegate extends FragmentLifecycleLogger {

    public AnalyticsFragmentLifecycleDelegate(String className) {
        super(className);
    }

    @Override public void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        // Analytics go here!
    }
}
