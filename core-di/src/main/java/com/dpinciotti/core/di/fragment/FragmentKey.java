package com.dpinciotti.core.di.fragment;

import android.support.v4.app.Fragment;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import dagger.MapKey;

/**
 * @author dpinciotti
 * @createdDate 1/25/17
 */

@MapKey
@Target({ElementType.METHOD})
public @interface FragmentKey {
    Class<? extends Fragment> value();
}