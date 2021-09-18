package com.kenjoel.springsecurityjwt.models;

public class ResponseClass {
    private String jwt;

    public ResponseClass(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}
