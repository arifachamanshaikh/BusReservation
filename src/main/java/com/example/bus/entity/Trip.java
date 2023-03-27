package com.example.bus.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Trip {
	@Id
	private Long trip_id;
	private String departure;
	private String arrival;
	private String date;
	
	@ManyToOne
	@JoinColumn(name = "id")
	User user;
	
	public Long getTrip_id() {
		return trip_id;
	}
	public void setTrip_id(Long trip_id) {
		this.trip_id = trip_id;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	

}
