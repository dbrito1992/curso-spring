package com.curso.resourcies;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.domain.User;

@RestController
@RequestMapping(value="/user")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User us = new User(1, "Diego Brito", "diego@teste.com.br", 29);
		return ResponseEntity.ok().body(us);
	}
}
