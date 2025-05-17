package com.ufrn.dimap.spotify.client;

import org.springframework.http.MediaType;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/*
curl -X POST "https://accounts.spotify.com/api/token" \
     -H "Content-Type: application/x-www-form-urlencoded" \
     -d "grant_type=client_credentials&client_id=your-client-id&client_secret=your-client-secret"
*/ 

@FeignClient(
    name = "AuthSpotifyClient",
    url =  "https://accounts.spotify.com"
)
public interface AuthSpotifyClient {

    @PostMapping(value = "/api/token", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    LoginResponse login(@RequestBody LoginRequest loginRequest); //definir o corpo da requisição

}
