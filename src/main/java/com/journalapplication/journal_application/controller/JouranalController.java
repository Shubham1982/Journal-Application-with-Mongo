package com.journalapplication.journal_application.controller;

import com.journalapplication.journal_application.entity.JournalEntry;
import com.journalapplication.journal_application.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/journal")
public class JouranalController {

    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping("")
    public List<JournalEntry> getAll() {
        return null;
    }

    @GetMapping("/id/{myId}")
    public JournalEntry getJournalEntryByID(@PathVariable ObjectId myId) {
        return journalEntryService.findById(myId).orElse(null);
    }

    @PostMapping("/")
    public JournalEntry createEntry(@RequestBody JournalEntry journalEntry) {
        journalEntry.setDate(LocalDateTime.now());
        return journalEntryService.saveEntry(journalEntry);
    }

    @GetMapping("/getAll")
    public List<JournalEntry> getAllEntires() {
        return journalEntryService.getAll();
    }

    @DeleteMapping("id/{myId}")
    public boolean deleteById(@PathVariable ObjectId id) {
        journalEntryService.deleteById(id);
        return true;
    }

    @PutMapping("/id/{id}")
    public JournalEntry updateJournalById(@PathVariable ObjectId id, @RequestBody JournalEntry newEntry) {
        JournalEntry old = journalEntryService.findById(id).orElse(null);
        if (old != null) {
            old.setTitle(newEntry.getTitle() != null && !newEntry.getTitle().equals("") ? newEntry.getTitle() : old.getTitle());
            old.setContent(newEntry.getContent() != null && !newEntry.getContent().equals("") ? newEntry.getContent() : old.getContent());
        }
        journalEntryService.saveEntry(old);
        return old;
    }
}













