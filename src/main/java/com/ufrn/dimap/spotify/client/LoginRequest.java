package com.ufrn.dimap.spotify.client;

public class LoginRequest {

    private String grantType;
    private String clientID;
    private String clientSecret;

    public LoginRequest() {
    }

    public LoginRequest(String grantType, String clientID, String clientSecret) {
        this.grantType = grantType;
        this.clientID = clientID;
        this.clientSecret = clientSecret;
    }

    public String getGrantType() {
        return grantType;
    }
    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }
    public String getClientID() {
        return clientID;
    }
    public void setClientID(String clientID) {
        this.clientID = clientID;
    }
    public String getClientSecret() {
        return clientSecret;
    }
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    

}
