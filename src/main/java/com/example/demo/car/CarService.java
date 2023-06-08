package com.example.demo.car;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService  {
	
	@Autowired
	CarRepository carRepo;

	
	public void create(CarModel car) {
		// TODO Auto-generated method stub
		carRepo.save(car);
		
	}

	
	public List<CarModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Optional<CarModel> findById(ObjectId _id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	
	public void updateOne(ObjectId _id, CarModel data) {
		// TODO Auto-generated method stub
		
	}

	
	public void removeOne(ObjectId _id) {
		// TODO Auto-generated method stub
		
	}

	
	

}
