package com.example.bus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bus.dao.TripRepository;
import com.example.bus.dao.UserRepository;
import com.example.bus.entity.Trip;
import com.example.bus.entity.User;

@Service

public class TripServiceImpl implements TripService {
	
	@Autowired
	private TripRepository tripRepository;
	
	@Override
	public Trip createTrip(Trip trip) {
		// TODO Auto-generated method stub
		return tripRepository.save(trip);
	}

	@Override
	public List<Trip> findAll() {
		// TODO Auto-generated method stub
		return tripRepository.findAll();
	}
    @Override
	public void deleteTripById(Long trip_id) {
		   tripRepository.deleteById(trip_id);
		}
	
	
}
