package com.tutorial.di.examples;

import javax.inject.Inject;

public class SetterInjection {

    private Utility utility;

    public Utility getUtility() {
        return utility;
    }

    @Inject
    public void setUtility(Utility utility) {
        this.utility = utility;
    }

    public void doSomething() {
        utility.doSomething();
    }
}
