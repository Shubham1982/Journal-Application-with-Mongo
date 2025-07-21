package com.journalapplication.journal_application.controller;

import com.journalapplication.journal_application.entity.User;
import com.journalapplication.journal_application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUser() {
        return userService.getAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveEntry(user);
    }

    @PutMapping
    public ResponseEntity<?> updateUser(@RequestBody User user, @PathVariable String userName) {
        User userByDB = userService.findByUserName(userName);
        if(userByDB != null){
            userByDB.setUserName(user.getUserName());
            userByDB.setPassword(user.getPassword());
        }
        userService.saveEntry(userByDB);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}













