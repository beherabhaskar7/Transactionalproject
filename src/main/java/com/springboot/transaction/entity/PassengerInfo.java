package com.springboot.transaction.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="PASSENGER_INFO")
public class PassengerInfo {

	@Id
	@GeneratedValue
	private long pId;
	private String name;
	private String email;
	private String source;
	private String Destination;
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
	private Date traveldate;
	private String pickupTime;
	private String arrivalTime;
	private double face;
	public PassengerInfo(long pId, String name, String email, String source, String destination, Date traveldate,
			String pickupTime, String arrivalTime, double face) {
		super();
		this.pId = pId;
		this.name = name;
		this.email = email;
		this.source = source;
		Destination = destination;
		this.traveldate = traveldate;
		this.pickupTime = pickupTime;
		this.arrivalTime = arrivalTime;
		this.face = face;
	}
	public long getpId() {
		return pId;
	}
	public void setpId(long pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public Date getTraveldate() {
		return traveldate;
	}
	public void setTraveldate(Date traveldate) {
		this.traveldate = traveldate;
	}
	public String getPickupTime() {
		return pickupTime;
	}
	public void setPickupTime(String pickupTime) {
		this.pickupTime = pickupTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public double getFace() {
		return face;
	}
	public void setFace(double face) {
		this.face = face;
	}
	public PassengerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
