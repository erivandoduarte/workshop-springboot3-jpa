package com.educandoweb.course.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")

public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Erivando", "erivandoduarte01@gmail.com", "85988781515", "131828");
		return ResponseEntity.ok().body(u);
	}

}
