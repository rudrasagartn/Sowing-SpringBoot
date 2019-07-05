package com.sowing.seed.model;

public class State {

	private long stateID;
	private String stateName;

	public State() {
		super();
		// TODO Auto-generated constructor stub
	}

	public State(long stateID, String stateName) {
		super();
		this.stateID = stateID;
		this.stateName = stateName;
	}

	public long getStateID() {
		return stateID;
	}

	public void setStateID(long stateID) {
		this.stateID = stateID;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

}
