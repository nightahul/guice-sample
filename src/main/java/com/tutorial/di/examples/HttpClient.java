package com.tutorial.di.examples;

public class HttpClient {

    private final String hostName;

    private final String protocol;

    public HttpClient(String hostName, String protocol) {
        this.hostName = hostName;
        this.protocol = protocol;
    }

    public String getHostName() {
        return hostName;
    }

    public String getProtocol() {
        return protocol;
    }
}
