package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    ArrayList<User> UserList = new ArrayList<>();
    UserController(){
        UserList.add(new User("Adolf", 35, 999));
        UserList.add(new User("Adolf", 35, 999));
        UserList.add(new User("Adolf", 35, 999));
        UserList.add(new User("Adolf", 35, 999));
        UserList.add(new User("Adolf", 35, 999));
        UserList.add(new User("Adolf", 35, 999));
        UserList.add(new User("Adolf", 35, 999));
        UserList.add(new User("Adolf", 35, 999));
    }
    @GetMapping("/list")
    public ArrayList<User> ListReturn(){
        return this.UserList;
    }
    @PostMapping("/postedBASE")
    public void addUser(User addingUser){
        UserList.add(addingUser);
    }
}
