package com.example.ThymeleafDemo.Repository;

import com.example.ThymeleafDemo.Domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private List<User> users = new ArrayList<>();

    public UserRepository() {
    }

    public void addUser(User user){
        users.add(user);
    }

    public List<User> getAllUsers(){
        return users;
    }


}
