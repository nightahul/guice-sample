package com.tutorial.di.examples;


import javax.inject.Inject;

public class ProviderExample {

    private final HttpClient httpClient;

    @Inject
    public ProviderExample(final HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public void printDetails() {
        System.out.println("Host Name is " + httpClient.getHostName());
        System.out.println("Protocol is " + httpClient.getProtocol());
    }
}
