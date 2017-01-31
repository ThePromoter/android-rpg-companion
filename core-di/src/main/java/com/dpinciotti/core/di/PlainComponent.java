package com.dpinciotti.core.di;

/**
 * @author dpinciotti
 * @createdDate 1/25/17
 */

public interface PlainComponent<T> {
    void inject(T injectTarget);
}
