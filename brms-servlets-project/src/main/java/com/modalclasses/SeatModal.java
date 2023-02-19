package com.modalclasses;

public class SeatModal {
	private int seatNo;
	
	public SeatModal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SeatModal(int seatNo) {
		super();
		this.seatNo = seatNo;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	@Override
	public String toString() {
		return "SeatModal [seatNo=" + seatNo + "]";
	}
	
	

}
