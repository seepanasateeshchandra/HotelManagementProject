package com.example.InterFace.Web.RequestDTO;

import java.time.LocalDate;

public class BookingRequest {
	
	private int id;
	
	private RoomRequest room;
	
	private LocalDate checkInDate;
	
	private LocalDate checkOutDate;
	
	private String status;
	
	private int totalPrice;
	
	private PaymentRequest payment;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public RoomRequest getRoom() {
		return room;
	}

	public void setRoom(RoomRequest room) {
		this.room = room;
	}

	public LocalDate getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}

	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public PaymentRequest getPayment() {
		return payment;
	}

	public void setPayment(PaymentRequest payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "BookingRequest [id=" + id + ", room=" + room + ", checkInDate=" + checkInDate + ", checkOutDate="
				+ checkOutDate + ", status=" + status + ", totalPrice=" + totalPrice + ", payment=" + payment + "]";
	}


	

}
