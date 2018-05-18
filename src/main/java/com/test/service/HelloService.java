package com.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.persistence.document.Hello;

@Service
public interface HelloService {

	public List<Hello> findAll();

	public void createHello(Hello hello);

	public void updateHello(Hello hello);

	public Hello findOne(String id);

	public void deleteHello(String id);
}
