package com.dc.gth.batplatform.model;

public class Place {
	private String name;
	private Coordinate location;

	public Place(String name, Coordinate location){
		this.name = name;
		this.location = location;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Coordinate getLocation() {
		return location;
	}
	
	public void setLocation(Coordinate location) {
		this.location = location;
	}
}
