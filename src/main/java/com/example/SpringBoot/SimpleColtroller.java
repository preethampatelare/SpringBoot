package com.example.SpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class SimpleColtroller {
    // http://localhost:8080/hi
    @GetMapping("/hi")
    public String sayhi(){
        return "hello your got Response from server !";
    }

    // http://localhost:8080/search?q=name
    DataBase db = new DataBase();

    // http://localhost:8080/AllUsers
    @GetMapping("/AllUsers")
    public List<User> getAll(){
        return db.allUsers();
    }
    /*@GetMapping("/use")
    public User getUserBuName(@RequestParam String q){
        return db.returnByName(q);
    }*/
    // http://localhost:8080/user/2
    @GetMapping("/user/{id}")
    public User returnById(@PathVariable int id){
        return db.returnById(id);
    }
    @GetMapping("/Users/{name}")
    public User getUserBuName(@PathVariable String name){
        return db.returnByName(name);
    }
}
