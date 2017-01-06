package com.tutorial.di.examples;

public class EmailService implements MessageService {

    public boolean sendMessage(final String msg,
                               final String receiver) {
        System.out.println("Email Message sent to " + receiver + " with message=" + msg);
        return true;
    }
}
