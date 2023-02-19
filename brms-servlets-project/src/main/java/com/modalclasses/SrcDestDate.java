package com.modalclasses;

public class SrcDestDate {
	private String regNo;
	private String source;
	private String destination;
	private int seatNo;
	
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public SrcDestDate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SrcDestDate(String regNo, String source, String destination) {
		super();
		this.regNo = regNo;
		this.source = source;
		this.destination = destination;
	}
	public String getRegNo() {
		return regNo;
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
	@Override
	public String toString() {
		return "SrcDestDate [regNo=" + regNo + ", source=" + source + ", destination=" + destination + ", seatNo="
				+ seatNo + "]";
	}
	
	
}
