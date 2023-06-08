package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v0/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@PostMapping("/add")
	public String add(@RequestBody UserModel user) {
		userService.add(user);
		return "Done";
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<UserModel>> getUsers(){
		return userService.getUsers();
		
	}
	
	@GetMapping("/{_id}")
	public Optional<UserModel> getUser(@PathVariable String _id) {
		return userService.findUser(_id);
	}

}
