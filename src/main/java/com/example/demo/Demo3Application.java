package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


@SpringBootApplication
@RestController
@EnableMongoRepositories
@RequestMapping("/api/v0")
@ComponentScan(basePackages = {"com.example.demo.car"})
public class Demo3Application {
	
	//@Autowired
	//UserRepository userRepo;


	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}
	
	
	/*@GetMapping("/all")
	public ResponseEntity<List<UserModel>> getUsers(){
		List<UserModel> users = new ArrayList<UserModel>();
		userRepo.findAll().forEach(users::add);
		return new ResponseEntity<>(users, HttpStatus.OK);
		
	}
	*/
	
	
	@GetMapping("/start")
	public String start() {
		return "start api version 0";
	}
	
	@GetMapping()
	public String getUser() {
		return "get user..."; 
	}

}
