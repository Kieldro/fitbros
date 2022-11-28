package com.fitbros.backend

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class BackendApplication {

	static void main(String[] args) {
		SpringApplication.run(BackendApplication, args)
	}

	@RequestMapping("/hello")
	String hello(@RequestParam(value = "name", defaultValue = "nicolas catranis, first of his name") String name) {
		String.format("Greetings fitbro, %s!", name);
	}

}
