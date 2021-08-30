package com.oehm6.Ticket_Booking.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="ticket_details")
public class TicketDetails implements Serializable{

	@Id
	@Column(name="id")
	@GenericGenerator(name = "id_auto", strategy = "increment")
	@GeneratedValue(generator="id_auto")
	private int id;
	
	@Column(name="start")
	private String start;
	
	@Column(name="destination")
	private String destination;
	
	@Column(name="travel_date")
	private Date travelDate;
	
	@Column(name="fare")
	private String fare;
	
	@Column(name="noof_psngers")
	private int noOfPassangers;
	
	@Column(name="status")
	private String status;

	public TicketDetails() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public String getFare() {
		return fare;
	}

	public void setFare(String fare) {
		this.fare = fare;
	}

	public int getNoOfPassangers() {
		return noOfPassangers;
	}

	public void setNoOfPassangers(int noOfPassangers) {
		this.noOfPassangers = noOfPassangers;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
