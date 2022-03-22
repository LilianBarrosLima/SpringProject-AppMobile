package com.lilianlima.app.ui.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lilianlima.app.ui.model.response.UserRest;

@RestController
@RequestMapping("users") // http://localhost:8080/users
public class UserController {

	@GetMapping
	public String getUsers(@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "limit", defaultValue = "50") int limit,
			@RequestParam(value = "sort", defaultValue = "desc") String sort) {

		return "get users was called wiht page= " + page + " and limit= " + limit + " sort = " + sort;
	}

	@GetMapping(path = "/{userId}", 
			produces = { 
					MediaType.APPLICATION_XML_VALUE, 
					MediaType.APPLICATION_JSON_VALUE 
					})
	
	public UserRest getUser(@PathVariable String userId) {
		UserRest returnValue = new UserRest();
		returnValue.setEmail("harry@test.com");
		returnValue.setFirstName("Harry");
		returnValue.setLastName("Potter");

		return returnValue;
	}

	@PostMapping
	public String createUser() {
		return "create user was called";
	}

	@PutMapping
	public String updateUser() {
		return "update user was called - update";
	}

	@DeleteMapping
	public String deleteUser() {
		return "delete user was called";
	}
}
