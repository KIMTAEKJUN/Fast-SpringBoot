package com.company.design.facade;

public class Ftp {
    private String host;
    private String port;
    private String path;

    public Ftp(String host, String port, String path) {
        this.host = host;
        this.port = port;
        this.path = path;
    }
}
