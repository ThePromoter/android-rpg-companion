package com.dpinciotti.core.di.activity;

import android.app.Activity;

import com.dpinciotti.core.di.PlainComponent;

/**
 * @author dpinciotti
 * @createdDate 1/25/17
 */

public interface ActivityComponentBuilderHost {

    <A extends Activity, B extends ActivityComponentBuilder<A, ? extends PlainComponent<A>>> B getActivityComponentBuilder(Class<A> activityKey, Class<B> builderType);
}