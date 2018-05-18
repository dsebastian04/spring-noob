package com.test.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.test.persistence.document.Hello;

public interface HelloRepository extends MongoRepository<Hello,String> {

	
}
