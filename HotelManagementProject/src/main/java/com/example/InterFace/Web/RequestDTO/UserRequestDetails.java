package com.example.InterFace.Web.RequestDTO;

import java.util.List;

public class UserRequestDetails {
	
	private Long id;
	
	private String name;
	
	private String email;
	
	private String password;
	
	private String phone;
	
	private String role;
	
	private List<BookingRequest> booking;
	
	private List<ReviewRequest> review;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<BookingRequest> getBooking() {
		return booking;
	}

	public void setBooking(List<BookingRequest> booking) {
		this.booking = booking;
	}

	public List<ReviewRequest> getReview() {
		return review;
	}

	public void setReview(List<ReviewRequest> review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "UserRequestDetails [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", phone=" + phone + ", role=" + role + ", booking=" + booking + ", review=" + review + "]";
	}

	
	

}
