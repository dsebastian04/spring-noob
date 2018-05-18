package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value="Configuration.xml")
public class Test1Application {

	public static void main(String[] args) {
		SpringApplication.run(Test1Application.class, args);
	}

}
