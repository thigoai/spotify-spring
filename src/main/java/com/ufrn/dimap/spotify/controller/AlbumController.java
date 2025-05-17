package com.ufrn.dimap.spotify.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("/spotify/api")
public class AlbumController {


    public AlbumController() {
        
    }

    @GetMapping("/albuns")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok().build();
    }
  
}
