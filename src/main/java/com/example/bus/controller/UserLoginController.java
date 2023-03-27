package com.example.bus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.bus.dao.UserRepository;
import com.example.bus.domain.UserDto;
import com.example.bus.entity.Status;
import com.example.bus.entity.User;
import com.example.bus.service.UserService;



@RestController
@RequestMapping("/")
public class UserLoginController {
	@Autowired
	private UserService userService;
	@Autowired
	UserRepository userRepository;
	
@GetMapping("/login/{username}")

	public Status login (@PathVariable User username) 
	{
	System.out.println("User details"+ username.getUserName());
	System.out.println("userpass "+ username.getPassword());
    User users = userRepository.findByUserName(username);
	System.out.print(users);
	//for(User other : users) {
		if(users!=null) {
			return Status.SUCCESS;
		}
	
	return Status.FAILURE;
	
	}
	
	@GetMapping("hello")
	public String hello() {
		return "Hey";
		
	}
	
	@GetMapping("allUsers")
	public List<User> findAll() {
		return userService.findAll();
		
	}
	
	
	
	
/*	@GetMapping("/busreservation/register/user")
	public User creatUser() {
		User user= new User();
		user.setUserName("arifa1");
		user.setEmail("email123");
		return userService.creatUser(user);
		*/
	@RequestMapping(value="/busreservation/register/user", method = RequestMethod.POST)
	public void addUser(@RequestBody User user) {
		 userService.creatUser(user);

	}
	@PutMapping("/busreservation/user/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Long id,@RequestBody User user){
		User getUser=userRepository.getById(id);
		getUser.setUserName(user.getUserName());
		getUser.setPassword(user.getPassword());
		User updateUser=userRepository.save(getUser);
		return ResponseEntity.ok().body(updateUser);
	}
	
	
	
}








