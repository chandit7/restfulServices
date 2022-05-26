package com.ramesh.server.main.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {
    public static  int userCount =5;
    //creating an instance of ArrayList
    private static final List<User> users = new ArrayList<>();
    //static block
    static {
        users.add(new User(1,"John", new Date()));
        users.add(new User(2,"Robin", new Date()));
        users.add(new User(3,"Adam", new Date()));
        users.add(new User(4,"Gilly", new Date()));
        users.add(new User(5,"jack", new Date()));
    }
    //method to retrieve all users

    public  List<User> findAll() {
        return users;
    }
    //method to add users
    public User save(User user){
        if(user.getId()==0){
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }
    //method to find a particular user
    public User findOne(int id){
        for(User user:users){
            if(user.getId()==id)
                return user;
        }
        return null;
    }
}
