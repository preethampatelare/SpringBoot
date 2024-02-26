package com.example.SpringBoot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBase {


    private List<User> list = new ArrayList<>();

    public DataBase(){
        list.add(new User(1,"Shashi",22));
        list.add(new User(2,"Preetham",23));
        list.add(new User(3,"Kodanla",42));
        list.add(new User(4,"U shekar",41));
    }
    public List<User> allUsers(){
        return list;
    }
    public User returnByName(String name){
        for(User u : list){
            if(u.getName().equals(name)){
                return u;
            }
        }
        return null;
    }
    public User returnById(int id){
        for(User u : list){
            if(u.getId() == id){
                return u;
            }
        }
        return null;
    }
    public User addUser(User user){
        list.add(user);
        return user;
    }
    public boolean deleteUser(int id){
        for(User user:list){
            if(user.getId()==id) {
                list.remove(user);
                return true;
            }
        }
        return false;
    }
}
