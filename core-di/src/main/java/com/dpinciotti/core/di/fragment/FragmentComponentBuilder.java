package com.dpinciotti.core.di.fragment;

import android.support.v4.app.Fragment;

import com.dpinciotti.core.di.ComponentBuilder;
import com.dpinciotti.core.di.PlainComponent;

/**
 * @author dpinciotti
 * @createdDate 1/25/17
 */

public interface FragmentComponentBuilder<A extends Fragment, C extends PlainComponent<A>> extends ComponentBuilder<A, C> {
}