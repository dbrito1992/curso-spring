package com.curso.resourcies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.domain.User;
import com.curso.services.UserService;

@RestController
@RequestMapping(value="/user")
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> obj = userService.findAll();
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<User> findById(@PathVariable Integer id){
		User obj = userService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
