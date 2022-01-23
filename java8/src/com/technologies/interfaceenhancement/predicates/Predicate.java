package com.technologies.interfaceenhancement.predicates;

@FunctionalInterface
public interface Predicate<T> {
    public boolean test(T t);
}
