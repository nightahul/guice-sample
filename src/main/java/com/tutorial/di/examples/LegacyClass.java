package com.tutorial.di.examples;

import javax.inject.Inject;

public class LegacyClass {

    @Inject
    static Utility utility;

    public static void callUtil() {
        utility.doSomething();
    }
}
