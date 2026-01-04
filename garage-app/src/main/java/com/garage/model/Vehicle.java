package com.garage.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
		  use = JsonTypeInfo.Id.NAME,
		  include = JsonTypeInfo.As.PROPERTY,
		  property = "type"
		)
@JsonSubTypes({
	 @JsonSubTypes.Type(value = Car.class, name = "Car"),
	 @JsonSubTypes.Type(value = Motorcycle.class, name = "Motorcycle"),
	 @JsonSubTypes.Type(value = Truck.class, name = "Truck")
})
public abstract class Vehicle {

	private String licensePlate;
	private String description;
	private int year;
	private String type;
	private String status;
	private int price;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	
	public Vehicle(String licensePlate, String description, int year, String type, String status, int price) {
		super();
		this.licensePlate = licensePlate;
		this.description = description;
		this.year = year;
		this.type = type;
		this.status = status;
		this.price = price;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
