package com.niit.collab.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.collab.DAO.UsersDAO;
import com.niit.collab.model.Users;

@RestController
public class UserController {
	@Autowired
	private UsersDAO usersDAO;

	@PostMapping(value="/register")
	public ResponseEntity<Users> save( @RequestBody Users users){
		System.out.println("hello");
		usersDAO.save(users);
		return new ResponseEntity<Users>(users, HttpStatus.OK);
		
	}
	@GetMapping(value="/users")
	public ResponseEntity<List<Users>> listuser(){
		System.out.println("list of users");
		List<Users> users =usersDAO.getAllUsers();
		return new ResponseEntity<List<Users>>(users,HttpStatus.OK);
		
		
	}
}
