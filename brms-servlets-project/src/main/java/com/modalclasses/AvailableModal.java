package com.modalclasses;

public class AvailableModal {
	private String regNo;
	private String source;
	private String destination;
	private String dateofTravel;
	private String arrivalTime;
	private String departuretime;
	private String ticketCharges;
	public AvailableModal(String regNo, String source, String destination, String dateofTravel, String arrivalTime,
			String departuretime, String ticketCharges) {
		super();
		this.regNo = regNo;
		this.source = source;
		this.destination = destination;
		this.dateofTravel = dateofTravel;
		this.arrivalTime = arrivalTime;
		this.departuretime = departuretime;
		this.ticketCharges = ticketCharges;
	}
	public String getRegNo() {
		return regNo;
	}
	public AvailableModal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDateofTravel() {
		return dateofTravel;
	}
	public void setDateofTravel(String dateofTravel) {
		this.dateofTravel = dateofTravel;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDeparturetime() {
		return departuretime;
	}
	public void setDeparturetime(String departuretime) {
		this.departuretime = departuretime;
	}
	public String getTicketCharges() {
		return ticketCharges;
	}
	public void setTicketCharges(String ticketCharges) {
		this.ticketCharges = ticketCharges;
	}
	@Override
	public String toString() {
		return "AvailableModal [regNo=" + regNo + ", source=" + source + ", destination=" + destination
				+ ", dateofTravel=" + dateofTravel + ", arrivalTime=" + arrivalTime + ", departuretime=" + departuretime
				+ ", ticketCharges=" + ticketCharges + "]";
	}
	
	
	

}
