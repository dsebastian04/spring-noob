package com.test.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.test.persistence.repository.HelloRepository;

@Configuration
@EnableMongoRepositories(basePackageClasses = HelloRepository.class)
public class MongoConfiguration {

}
