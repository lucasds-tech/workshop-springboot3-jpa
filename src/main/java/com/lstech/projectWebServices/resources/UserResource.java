package com.lstech.projectWebServices.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lstech.projectWebServices.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Daniela", "daniela@gmail.com", "40028922", "12345");
		return ResponseEntity.ok().body(u);
	}
}
