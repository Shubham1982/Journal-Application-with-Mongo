package com.journalapplication.journal_application.Repository;

import com.journalapplication.journal_application.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId>{

    User findByUserName(String userName);
}
