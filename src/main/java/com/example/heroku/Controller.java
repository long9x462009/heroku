package com.example.heroku;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/heroku")
    public String heroku(){
        return "hello, heroku";
    }

}
