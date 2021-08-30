package com.oehm6.Ticket_Booking.Dto;

import java.io.Serializable;

import javax.persistence.Column;

public class BusDetailsDto implements Serializable{

	@Column(name="start")
	private String start;
	
	@Column(name="destination")
	private String destination;

	public BusDetailsDto() {
		super();
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
}
