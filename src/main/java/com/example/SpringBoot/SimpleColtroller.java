package com.example.SpringBoot;

import org.springframework.web.bind.annotation.GetMapping;

public class SimpleColtroller {
    @GetMapping("/hi")
    public String sayhi(){
        return "hello your got Response from server !";
    }

}
