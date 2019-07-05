package com.sowing.seed.model;

public class City {

	private long cityID;
	private String cityName;
	private long stateID;

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public City(long cityID, String cityName) {
		super();
		this.cityID = cityID;
		this.cityName = cityName;
	}

	
	

	public City(long cityID, String cityName, long stateID) {
		super();
		this.cityID = cityID;
		this.cityName = cityName;
		this.stateID = stateID;
	}

	public long getCityID() {
		return cityID;
	}

	public void setCityID(long cityID) {
		this.cityID = cityID;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public long getStateID() {
		return stateID;
	}

	public void setStateID(long stateID) {
		this.stateID = stateID;
	}

}
