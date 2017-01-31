package com.dpinciotti.core.di;

/**
 * @author dpinciotti
 * @createdDate 1/25/17
 */

public interface ComponentBuilderHost {
    /**
     * @param key         map lookup key, typically the injection target type of the component
     * @param builderType expected builder type to be returned
     * @param <T>         injection target type of component produced by returned builder
     * @param <B>         expected builder type for the given key
     * @return a new component builder associated with key type
     */
    <T, B extends ComponentBuilder<T, ? extends PlainComponent<T>>> B getComponentBuilder(Class<T> key, Class<B> builderType);
}