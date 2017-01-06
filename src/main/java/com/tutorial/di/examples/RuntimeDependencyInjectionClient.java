package com.tutorial.di.examples;


import javax.inject.Inject;

public class RuntimeDependencyInjectionClient {

    private final RuntimeDependencyInjectionFactory runtimeDependencyInjectionFactory;

    @Inject
    public RuntimeDependencyInjectionClient(final RuntimeDependencyInjectionFactory runtimeDependencyInjectionFactory){
        this.runtimeDependencyInjectionFactory =  runtimeDependencyInjectionFactory;
    }

    public void callMyService(final String name){
        runtimeDependencyInjectionFactory.create(name).callMyService();
    }
}
