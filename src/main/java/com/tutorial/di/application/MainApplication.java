package com.tutorial.di.application;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.tutorial.di.examples.FieldInjection;
import com.tutorial.di.examples.RuntimeDependencyInjectionClient;
import com.tutorial.di.examples.SimpleConstructorInjection;
import com.tutorial.di.module.ApplicationModule;

public class MainApplication {

    public static void main(String[] args) {
        final Injector injector = Guice.createInjector(new ApplicationModule());
        final RuntimeDependencyInjectionClient simpleConstructorInjection = injector.getInstance(RuntimeDependencyInjectionClient.class);
        simpleConstructorInjection.callMyService("Rabbit");
    }
}
