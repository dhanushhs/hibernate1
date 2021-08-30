package com.oehm6.Ticket_Booking.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="bus_details")
public class BusDetails implements Serializable{
	
	@Id
	@Column(name="id")
	@GenericGenerator(name="m_auto", strategy="increment")
	@GeneratedValue(generator="m_auto")
	private int id;
	
	@Column(name="bus_name")
	private String busName;
	
	@Column(name="timings")
	private String timings;
	
	@Column(name="start")
	private String start;
	
	@Column(name="destination")
	private String destination;
	
	@Column(name="fare")
	private int fare;
	
	public BusDetails() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return busName;
	}

	public void setName(String busName) {
		this.busName = busName;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	public String getFrom() {
		return start;
	}

	public void setFrom(String start) {
		this.start = start;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "BusDetails [id=" + id + ", busName=" + busName + ", timings=" + timings + ", start=" + start
				+ ", destination=" + destination + ", fare=" + fare + "]";
	}
}
