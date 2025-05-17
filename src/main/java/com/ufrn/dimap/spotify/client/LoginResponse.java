package com.ufrn.dimap.spotify.client;

public class LoginResponse {

    private String accesToken;

    public LoginResponse() {
    }

    public LoginResponse(String accesToken) {
        this.accesToken = accesToken;
    }

    public String getAccesToken() {
        return accesToken;
    }

    public void setAccesToken(String accesToken) {
        this.accesToken = accesToken;
    }

}
