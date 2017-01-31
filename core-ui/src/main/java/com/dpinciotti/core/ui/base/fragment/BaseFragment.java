package com.dpinciotti.core.ui.base.fragment;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.MenuRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dpinciotti.core.di.fragment.FragmentComponentBuilderHost;
import com.dpinciotti.core.ui.di.component.BaseFragmentComponent;
import com.dpinciotti.core.ui.di.module.BaseFragmentModule;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by thepromoter on 1/30/17.
 */

public abstract class BaseFragment extends Fragment {

    @Inject FragmentLifecycleDelegate lifecycleDelegate;

    private Unbinder unbinder;

    @LayoutRes protected abstract int getLayoutRes();

    @MenuRes protected int getMenuRes() {
        return 0;
    }

    @Override public void onCreate(Bundle savedInstanceState) {
        injectDependencies();
        super.onCreate(savedInstanceState);

//        FragmentArgs.inject(this);

        if (lifecycleDelegate == null) {
            injectBasicDependencies();
        }
        lifecycleDelegate.onCreate(savedInstanceState);
    }

    @Override public void onDestroy() {
        super.onDestroy();
        lifecycleDelegate.onDestroy();
    }

    @Nullable @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        if (getMenuRes() > 0) {
            setHasOptionsMenu(true);
        }

        View view = inflater.inflate(getLayoutRes(), container, false);

        lifecycleDelegate.onCreateView(inflater, container, savedInstanceState);
        return view;
    }

    @Override public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        if (getMenuRes() > 0) {
            inflater.inflate(getMenuRes(), menu);
        }
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        unbinder = ButterKnife.bind(this, view);
        lifecycleDelegate.onViewCreated(view, savedInstanceState);
    }

    @Override public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
        lifecycleDelegate.onDestroyView();
    }

    @Override public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        lifecycleDelegate.onSaveInstanceState(outState);
    }

    @Override public void onStart() {
        super.onStart();
        lifecycleDelegate.onStart();
    }

    @Override public void onStop() {
        super.onStop();
        lifecycleDelegate.onStop();
    }

    @Override public void onPause() {
        super.onPause();
        lifecycleDelegate.onPause();
    }

    @Override public void onResume() {
        super.onResume();
        lifecycleDelegate.onResume();
    }

    @Override public void onDetach() {
        super.onDetach();
        lifecycleDelegate.onDetach();
    }

    private void injectBasicDependencies() {
        ((FragmentComponentBuilderHost) getActivity())
            .getFragmentComponentBuilder(BaseFragment.class, BaseFragmentComponent.Builder.class)
            .fragmentModule(new BaseFragmentModule(this))
            .build()
            .inject(this);
    }

    protected abstract void injectDependencies();
}
