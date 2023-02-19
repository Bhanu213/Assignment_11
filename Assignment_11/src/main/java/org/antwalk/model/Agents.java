package org.antwalk.model;

public class Agents {
	int agentId;
	String agentName;
	String workingArea;
	String mobileNumber;
	String country;
	public Agents() {
		super();
	}
	public Agents(int agentId, String agentName, String workingArea, String mobileNumber, String country) {
		super();
		this.agentId = agentId;
		this.agentName = agentName;
		this.workingArea = workingArea;
		this.mobileNumber = mobileNumber;
		this.country = country;
	}
	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getWorkingArea() {
		return workingArea;
	}
	public void setWorkingArea(String workingArea) {
		this.workingArea = workingArea;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Agents [agentId=" + agentId + ", agentName=" + agentName + ", workingArea=" + workingArea
				+ ", mobileNumber=" + mobileNumber + ", country=" + country + "]";
	}
	
}
