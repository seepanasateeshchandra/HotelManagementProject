package com.example.InterFace.Web.Entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Table
@Entity
public class Booking {
	@Id
	@Column
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int bookingId;
	
	
	
	@JoinColumn
	@ManyToOne(cascade = CascadeType.ALL)
	private RoomDetails room;
	
	@Column
	private LocalDate checkInDate;
	
	@Column
	private LocalDate checkOutDate;
	
	@Column
	private String status;
	
	
	@Column
	private int totalPrice;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="payment_id")
	private Payment payment;


	public int getBookingId() {
		return bookingId;
	}


	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}




	public RoomDetails getRoom() {
		return room;
	}


	public void setRoom(RoomDetails room) {
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


	public Payment getPayment() {
		return payment;
	}


	public void setPayment(Payment payment) {
		this.payment = payment;
	}


	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", room=" + room + ", checkInDate=" + checkInDate + ", checkOutDate="
				+ checkOutDate + ", status=" + status + ", totalPrice=" + totalPrice + ", payment=" + payment + "]";
	}
	
	
	

}
