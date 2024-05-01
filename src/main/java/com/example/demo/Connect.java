package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Connect {
    

    @GetMapping("/")
    public String Homepage(){
        return("index");
    }
}
