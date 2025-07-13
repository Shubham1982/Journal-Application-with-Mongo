package com.journalapplication.journal_application.service;

import com.journalapplication.journal_application.Repository.JournalRepository;
import com.journalapplication.journal_application.entity.JournalEntry;
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

    public Optional<JournalEntry> findById(ObjectId myId){
       return journalRepository.findById(myId);
    }

    public JournalEntry saveEntry(JournalEntry journalEntry){
        return journalRepository.save(journalEntry);
    }
    public List<JournalEntry> getAll(){
        return journalRepository.findAll();
    }
    public void deleteById(ObjectId id){
        journalRepository.deleteById(id);
    }
}