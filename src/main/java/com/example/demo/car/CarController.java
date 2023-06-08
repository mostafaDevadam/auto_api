package com.example.demo.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v0/car")
public class CarController {
	
	@Autowired
	CarService carService;
	
	@GetMapping()
	public String car() {
		return "car...!!!";
	}
	
	@PostMapping("/add")
	public void create(@RequestBody CarModel car) {
		carService.create(car);
		
		
	}

}
