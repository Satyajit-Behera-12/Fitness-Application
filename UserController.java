package com.FitnessApplication.www.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FitnessApplication.www.Entity.User;
import com.FitnessApplication.www.Repository.UserRepository;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api/users")
public class UserController {
 
	@Autowired
	private UserRepository userRepository;
		
	@PostMapping("/register")
	public User registerUser( @RequestBody User user) {
		return userRepository.save(user);
		
	}
	@GetMapping("/{id}")
	public User getById(@PathVariable int id) {
		 
		return userRepository.findById(id).orElseThrow();
	}
}
