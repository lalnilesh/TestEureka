package com.netflix.eureka2.registry;

/**
 * Implement this interface for any data classes that need to express a data source.
 *
 * @author David Liu
 */
public interface Sourced {
    Source getSource();
}
