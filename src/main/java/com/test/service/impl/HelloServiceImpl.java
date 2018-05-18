package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.persistence.document.Hello;
import com.test.persistence.repository.HelloRepository;
import com.test.service.HelloService;

public class HelloServiceImpl implements HelloService {

	@Autowired
	private HelloRepository repository;
	
	@Override
	public List<Hello> findAll() {
		return repository.findAll();
	}

	@Override
	public void createHello(Hello hello) {

	    repository.insert(hello);
	}

	@Override
	public void updateHello(Hello hello) {
		repository.save(hello);
	}

	@Override
	public Hello findOne(String id) {
		return repository.findOne(id);

	}

	@Override
	public void deleteHello(String id) {
		repository.delete(id);

	}

	public void setRepository(HelloRepository repository) {
		this.repository = repository;
	}

	
}
