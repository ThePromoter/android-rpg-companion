package com.dpinciotti.rpg.companion.myth;

import android.os.Bundle;

import com.dpinciotti.core.ui.base.activity.ActivityLifecycleLogger;

/**
 * Created by thepromoter on 1/30/17.
 */

public class AnalyticsActivityLifecycleDelegate extends ActivityLifecycleLogger {

    public AnalyticsActivityLifecycleDelegate(String className) {
        super(className);
    }

    @Override public void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        // Analytics go here!
    }
}
