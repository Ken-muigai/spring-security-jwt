package com.kenjoel.springsecurityjwt;

import com.kenjoel.springsecurityjwt.models.Authentication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

    @RequestMapping({"/hello"})
    public String hello(){
        return "Stuff gotten";
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthentication(@RequestBody Authentication auth) throws Exception{

    }
    public String authenticate_user(@RequestBody Authentication authentication){
        return "happy";
    }
}
