package com.iax.iteratorEx;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
