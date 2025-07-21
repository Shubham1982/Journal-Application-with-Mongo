package com.journalapplication.journal_application.service;

import com.journalapplication.journal_application.Repository.JournalRepository;
import com.journalapplication.journal_application.Repository.UserRepository;
import com.journalapplication.journal_application.entity.JournalEntry;
import com.journalapplication.journal_application.entity.User;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Optional<User> findById(ObjectId myId){
       return userRepository.findById(myId);
    }
    public User saveEntry(User user){
        return userRepository.save(user);
    }
    public List<User> getAll(){
        return userRepository.findAll();
    }
    public void deleteById(ObjectId id){
        userRepository.deleteById(id);
    }
    public User findByUserName(String userName){
        return userRepository.findByUserName(userName);
    }
}