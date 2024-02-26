package com.example.SpringBoot;

import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/getAllUsers")
    public List<User> getAll(){
        return db.allUsers();
    }
    @GetMapping("/getUserBySearchName")
    public User getUserBuName(@RequestParam String q){
        return db.returnByName(q);
    }
    // http://localhost:8080/user/2
    @GetMapping("/getUserById/{id}")
    public User returnById(@PathVariable int id){
        return db.returnById(id);
    }
    /*@GetMapping("/Users/{name}")
    public User getUserBuName(@PathVariable String name){
        return db.returnByName(name);
    }*/
    @PostMapping("/AddUser")
    public User postUser(@RequestBody User user){
        return db.addUser(user);
    }

    @DeleteMapping("/DeleteUser/{id}")
    public boolean removeUser(@PathVariable int id){
        return db.deleteUser(id);
    }
}
