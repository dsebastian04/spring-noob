package com.test.webservices.impl;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.test.persistence.document.Hello;
import com.test.service.HelloService;
import com.test.webservices.HelloRest;

public class HelloRestImpl implements HelloRest {

	private HelloService service;

	@Override
	public List<Hello> findAll() {

		return service.findAll();
	}

	@Override
	public void createHello(@RequestBody Hello hello) {
		service.createHello(hello);

	}

	@Override
	public void updateHello(@RequestBody Hello hello) {
		service.updateHello(hello);
	}

	@Override
	public Hello findOne(@PathVariable String id) {
		return service.findOne(id);
	}

	@Override
	public void deleteHello(@PathVariable String id) {
		service.deleteHello(id);
	}

	public void setService(HelloService service) {
		this.service = service;
	}

}
