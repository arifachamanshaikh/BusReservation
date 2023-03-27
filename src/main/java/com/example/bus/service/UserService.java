package com.example.bus.service;

import java.util.List;

import com.example.bus.domain.UserDto;
import com.example.bus.entity.User;


public interface UserService {
	
	UserDto getUser(String username);
	
	User getUserFromDB(User username);
	
	
	User creatUser(User user);
	
	List<User> findAll();

}
