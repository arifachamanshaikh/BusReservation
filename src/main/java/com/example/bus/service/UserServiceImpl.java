package com.example.bus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bus.dao.UserRepository;
import com.example.bus.domain.UserDto;
import com.example.bus.entity.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDto getUser(String username) {
		UserDto user = new UserDto();
		user.setUsername("arifa");
		user.setEmail("addd");
;		return user;
	}

	@Override
	public User getUserFromDB(User userName) {
		return userRepository.findByUserName(userName);
	}
	
	
	@Override
	public User creatUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
