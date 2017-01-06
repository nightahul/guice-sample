package com.tutorial.di.examples;

import com.google.inject.Singleton;

@Singleton
public class Utility {

    public void doSomething(){
        System.out.println("I'm doing something.");
    }
}
