package com.dpinciotti.core.di.activity;

import android.app.Activity;

import com.dpinciotti.core.di.ComponentBuilder;
import com.dpinciotti.core.di.PlainComponent;

/**
 * @author dpinciotti
 * @createdDate 1/25/17
 */

public interface ActivityComponentBuilder<A extends Activity, C extends PlainComponent<A>> extends ComponentBuilder<A, C> {
}