package com.example.bus.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bus.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>  {

	User findByUserName(User username);
	

	
}
