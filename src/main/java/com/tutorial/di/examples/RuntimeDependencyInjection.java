package com.tutorial.di.examples;

import com.google.inject.assistedinject.Assisted;

import javax.inject.Inject;

public class RuntimeDependencyInjection {

    private final EmailService emailService;
    private final FacebookService facebookService;
    private final String name;

    @Inject
    public RuntimeDependencyInjection(@Assisted final String name,
                                      final EmailService emailService,
                                      final FacebookService facebookService) {
        this.name = name;
        this.emailService = emailService;
        this.facebookService = facebookService;
    }

    public void callMyService() {
        emailService.sendMessage("Hello from email service", name);
        facebookService.sendMessage("Hello from fb service", name);
    }

}
