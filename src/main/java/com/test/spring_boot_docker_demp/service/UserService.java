package com.test.spring_boot_docker_demp.service;

import com.test.spring_boot_docker_demp.model.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {


    public User saveUser(User user) {
       return user;
    }

    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("John Doe", 30));
        users.add(new User("Jane Smith", 25));
        return users;
    }

    public User getUserById(Long id) {
        // In a real application, you would retrieve the user from a database
        // Here we just return a dummy user for demonstration purposes
        return new User("John Doe", 30);
    }
}