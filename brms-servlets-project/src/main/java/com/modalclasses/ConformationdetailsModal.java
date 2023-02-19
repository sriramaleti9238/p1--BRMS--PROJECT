package com.modalclasses;

public class ConformationdetailsModal {
	private String source;
	private String destination;
	private String busregNo;
	private String boardingTime;
	private String departTime;
	private int seatNo;
	private String dateOfTravel;
	private String passengerName;
	private String email;
	private String ticketCharges;
	private String mblNum;
	
	
	public ConformationdetailsModal() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ConformationdetailsModal(String source, String destination, String busregNo, String boardingTime,
			String departTime, int seatNo, String dateOfTravel, String passengerName, String email) {
		super();
		this.source = source;
		this.destination = destination;
		this.busregNo = busregNo;
		this.boardingTime = boardingTime;
		this.departTime = departTime;
		this.seatNo = seatNo;
		this.dateOfTravel = dateOfTravel;
		this.passengerName = passengerName;
		this.email = email;
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


	public String getBusregNo() {
		return busregNo;
	}


	public void setBusregNo(String busregNo) {
		this.busregNo = busregNo;
	}


	public String getBoardingTime() {
		return boardingTime;
	}


	public void setBoardingTime(String boardingTime) {
		this.boardingTime = boardingTime;
	}


	public String getDepartTime() {
		return departTime;
	}


	public void setDepartTime(String departTime) {
		this.departTime = departTime;
	}


	public int getSeatNo() {
		return seatNo;
	}


	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}


	public String getDateOfTravel() {
		return dateOfTravel;
	}


	public void setDateOfTravel(String dateOfTravel) {
		this.dateOfTravel = dateOfTravel;
	}


	public String getPassengerName() {
		return passengerName;
	}


	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	

	public String getTicketCharges() {
		return ticketCharges;
	}


	public void setTicketCharges(String ticketCharges) {
		this.ticketCharges = ticketCharges;
	}


	public String getMblNum() {
		return mblNum;
	}


	public void setMblNum(String mblNum) {
		this.mblNum = mblNum;
	}


	@Override
	public String toString() {
		return "ConformationdetailsModal [source=" + source + ", destination=" + destination + ", busregNo=" + busregNo
				+ ", boardingTime=" + boardingTime + ", departTime=" + departTime + ", seatNo=" + seatNo
				+ ", dateOfTravel=" + dateOfTravel + ", passengerName=" + passengerName + ", email=" + email + "]";
	}
	
	
	
	
	
	
}
