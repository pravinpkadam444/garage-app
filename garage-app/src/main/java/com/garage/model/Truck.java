package com.garage.model;

public class Truck extends Vehicle {

	
	 private int weightLimit;

	    public Truck() {
	        setType("Truck");
	        setPrice(5000);
	    }

	    public int getWeightLimit() { return weightLimit; }
	    public void setWeightLimit(int weightLimit) { this.weightLimit = weightLimit; }
}
