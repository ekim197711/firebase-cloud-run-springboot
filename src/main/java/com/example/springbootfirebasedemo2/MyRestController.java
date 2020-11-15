package com.example.springbootfirebasedemo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @GetMapping("/someinfo")
    public String someinfo(){
        return "Try to sing this: Blaaaa bla blaaa bla bla!";
    }
}
