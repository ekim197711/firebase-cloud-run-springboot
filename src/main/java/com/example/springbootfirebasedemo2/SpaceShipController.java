package com.example.springbootfirebasedemo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/space")
public class SpaceShipController {

    @GetMapping("/destination")
    public String someinfo(){
        return "Plz go to Mars and establish a base!";
    }
}
