package com.dpinciotti.core.di.activity;

import android.app.Activity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import dagger.MapKey;

/**
 * @author dpinciotti
 * @createdDate 1/25/17
 */

@MapKey
@Target({ElementType.METHOD})
public @interface ActivityKey {
    Class<? extends Activity> value();
}