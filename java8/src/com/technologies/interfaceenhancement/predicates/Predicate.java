package com.technologies.interfaceenhancement.predicates;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
