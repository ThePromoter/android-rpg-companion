package com.dpinciotti.core.di.fragment;

import android.support.v4.app.Fragment;

import com.dpinciotti.core.di.PlainComponent;

/**
 * @author dpinciotti
 * @createdDate 1/25/17
 */

public interface FragmentComponentBuilderHost {

    <A extends Fragment, B extends FragmentComponentBuilder<A, ? extends PlainComponent<A>>> B getFragmentComponentBuilder(Class<A> fragmentKey, Class<B> builderType);
}