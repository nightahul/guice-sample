package com.tutorial.di.examples;


import javax.inject.Inject;
import javax.inject.Named;

public class InjectMultipleImplementation {

    private final MessageService fbService;

    private final MessageService emailService;

    @Inject
    public InjectMultipleImplementation(@Named("emailService") final MessageService emailService,
                                        @Named("fbService") final MessageService fbService) {
        this.emailService = emailService;
        this.fbService = fbService;
    }

    public void callEmailService() {
        emailService.sendMessage("Hello from email service", "Vivek");
    }

    public void callFbService() {
        fbService.sendMessage("Hello from fb service", "Vivek");
    }
}
