package com.technologies.interfaceenhancement.predicates;

public class PredicateDemo implements Predicate<Integer> {
    @Override
    public boolean test(Integer age) {
        return age > 18;
    }
}
