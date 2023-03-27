package com.example.bus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.bus.dao.TripRepository;
import com.example.bus.dao.UserRepository;
import com.example.bus.entity.Trip;
import com.example.bus.service.TripService;

@RestController
@RequestMapping("/")
public class TripController {
	
	@Autowired
	private TripService tripService;
	@Autowired
	TripRepository tripRepository;
	
	UserRepository userRepository;
	
	@RequestMapping(value="/busreservation/{id}/trip/{trip_id}", method = RequestMethod.POST)
	public void addTrip(@PathVariable Long id ,@PathVariable Long trip_id,@RequestBody Trip trip) {
		System.out.println(trip.getTrip_id());
		System.out.println(trip.getDeparture());
		 
		 
		 System.out.println(trip.getArrival());
		 System.out.println(trip.getDate());
		 tripService.createTrip(trip);
	}
		 
		 @GetMapping("busreservation/trip")
			public List<Trip> findAll() {
				return tripService.findAll();
				
		

	}

		// @RequestMapping(value="/busreservation/{id}/trip/{trip_id}", method = RequestMethod.DELETE)
		// {
		//	System.out.println("xyz") 
		// }
		 
		 @RequestMapping(value = "/busreservation/{id}/trip/{trip_id}", method = RequestMethod.DELETE)
		 public void deleteEmployee(@PathVariable("trip_id") Long trip_id) {
			   tripService.deleteTripById(trip_id);
			}
			 
		 
		 
		 
		 
		 
}
