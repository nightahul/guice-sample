package com.tutorial.di.examples;

import javax.inject.Inject;

public class FieldInjection {

    @Inject
    private Utility utility;

    public void printSomething() {
        utility.doSomething();
    }
}
