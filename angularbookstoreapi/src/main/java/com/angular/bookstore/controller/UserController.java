package com.angular.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angular.bookstore.model.Photo;
import com.angular.bookstore.model.User;
import com.angular.bookstore.repository.UserRepository;
import com.angular.bookstore.service.PhotoService;

import reactor.core.publisher.Mono;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "users")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/get")
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	@PostMapping("/add")
	public void createUser(@RequestBody User user) {
		userRepository.save(user);
	}
	
	@Autowired
	private PhotoService photoService;
	
	@GetMapping("/get/photo")
	public Mono<List> getPhoto() {
		return (Mono<List>) photoService.getPhoto();
	}
	
}
