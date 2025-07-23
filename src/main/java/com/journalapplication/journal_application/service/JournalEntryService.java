package com.journalapplication.journal_application.service;

import com.journalapplication.journal_application.Repository.JournalRepository;
import com.journalapplication.journal_application.entity.JournalEntry;
import com.journalapplication.journal_application.entity.User;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {
    @Autowired
    private JournalRepository journalRepository;
    @Autowired
    private UserService userService;

    public Optional<JournalEntry> findById(ObjectId myId){
       return journalRepository.findById(myId);
    }

    public void saveEntry(JournalEntry journalEntry,String userName){
        User user = userService.findByUserName(userName);
        journalEntry.setDate(LocalDateTime.now());
        JournalEntry saved = journalRepository.save(journalEntry);
        user.getJournalEntryList().add(saved);
        userService.saveEntry(user);
    }
    public void saveEntry(JournalEntry journalEntry){
        journalEntry.setDate(LocalDateTime.now());
        journalRepository.save(journalEntry);
    }
    public List<JournalEntry> getAll(){
        return journalRepository.findAll();
    }
    public void deleteById(ObjectId id){
        journalRepository.deleteById(id);
    }
}