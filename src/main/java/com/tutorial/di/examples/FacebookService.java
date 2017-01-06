package com.tutorial.di.examples;


public class FacebookService implements MessageService {

    public boolean sendMessage(final String msg,
                               final String receiver) {
        System.out.println("Message sent to Facebook user " + receiver + " with message=" + msg);
        return true;
    }

}
