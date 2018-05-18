package com.test.webservices;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.persistence.document.Hello;

@RestController
@RequestMapping("/greetings")
public interface HelloRest {

	@GetMapping
	public List<Hello> findAll();
	
	@PostMapping
	public void createHello(@RequestBody Hello hello);
	
	@PutMapping("/{id}")
	public void updateHello(@RequestBody Hello hello);
	
	@GetMapping("/{id}")
	public Hello findOne(@PathVariable String id);
	
	@DeleteMapping("/{id}")
	public void deleteHello(@PathVariable String id);
	
	
}
