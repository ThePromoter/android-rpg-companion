package com.dpinciotti.rpg.companion.myth.di.component;

import com.dpinciotti.core.di.PlainComponent;
import com.dpinciotti.core.di.scope.ApplicationScope;
import com.dpinciotti.rpg.companion.myth.MythApplication;
import com.dpinciotti.rpg.companion.myth.di.binder.ActivityBinders;

import dagger.Component;

/**
 * Created by thepromoter on 1/30/17.
 */

@ApplicationScope
@Component(modules = {
    ActivityBinders.class
})
public interface AppComponent extends PlainComponent<MythApplication> {

}
