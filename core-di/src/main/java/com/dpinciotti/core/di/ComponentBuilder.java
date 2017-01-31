package com.dpinciotti.core.di;

/**
 * @author dpinciotti
 * @createdDate 1/25/17
 */

public interface ComponentBuilder<T, C extends PlainComponent<T>> {
    C build();
}
