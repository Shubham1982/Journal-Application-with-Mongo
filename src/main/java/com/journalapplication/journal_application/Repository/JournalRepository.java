package com.journalapplication.journal_application.Repository;

import com.journalapplication.journal_application.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalRepository extends MongoRepository<JournalEntry, ObjectId>{

}
