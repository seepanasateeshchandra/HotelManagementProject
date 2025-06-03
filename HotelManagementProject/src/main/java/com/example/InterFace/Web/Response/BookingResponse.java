package com.example.InterFace.Web.Response;

import java.time.LocalDate;



public class BookingResponse {
	
private int id;
	
	private RoomResponse room;
	
	private LocalDate checkInDate;
	
	private LocalDate checkOutDate;
	
	private String status;
	
	private int totalPrice;
	
	private PaymentResponse payment;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RoomResponse getRoom() {
		return room;
	}

	public void setRoom(RoomResponse room) {
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

	public PaymentResponse getPayment() {
		return payment;
	}

	public void setPayment(PaymentResponse payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "BookingResponse [id=" + id + ", room=" + room + ", checkInDate=" + checkInDate + ", checkOutDate="
				+ checkOutDate + ", status=" + status + ", totalPrice=" + totalPrice + ", payment=" + payment + "]";
	}

	
	
	

}
