package com.example.bus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.bus.dao.TripRepository;
import com.example.bus.entity.Trip;
import com.example.bus.entity.User;

public interface TripService {
	

	
	
	
	Trip createTrip(Trip trip);
	void deleteTripById(Long trip_id);
	
	   
	
	
	List<Trip> findAll();

}
