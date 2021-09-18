package com.kenjoel.springsecurityjwt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloResource {
    @RequestMapping({"/hello"})
    public String get_stuff(){
        return "Stuff gotten";
    }
}
