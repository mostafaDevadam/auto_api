package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	public String add(UserModel user) {
		userRepo.save(user);
		return "Done";
	}
	
    public ResponseEntity<List<UserModel>> getUsers(){
		List<UserModel> users = new ArrayList<UserModel>();
		userRepo.findAll().forEach(users::add);
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
	
	public Optional<UserModel> findUser(String _id) {
		Optional<UserModel> user = userRepo.findById( new ObjectId( _id));
		
		
		return user;
	}
	
	public Boolean update(String _id, UserModel user) {
		
		return true;
	}
	
	public Boolean remove(String _id) {
		
		return true;
	}

}
