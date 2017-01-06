package com.tutorial.di.examples;


import javax.inject.Inject;

public class SimpleConstructorInjection {

    private final EmailService emailService;
    private final FacebookService facebookService;

    @Inject
    public SimpleConstructorInjection(final EmailService emailService,
                                      final FacebookService facebookService) {
        this.emailService = emailService;
        this.facebookService = facebookService;
    }


    public void callMyService() {
        emailService.sendMessage("Hello from email service", "Vivek");
        facebookService.sendMessage("Hello from fb service", "Vivek");
    }
}
