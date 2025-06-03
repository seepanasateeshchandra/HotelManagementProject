package com.example.InterFace.Web.Response;

import java.util.List;

import com.example.InterFace.Web.RequestDTO.BookingRequest;
import com.example.InterFace.Web.RequestDTO.ReviewRequest;

public class UserResponseDetails {
	
   private Long id;
	
	private String name;
	
	private String email;
	
	private String password;
	
	private String phone;
	
	private String role;
	
	private List<BookingResponse> booking;
	
	private List<ReviewResponse> review;

	@Override
	public String toString() {
		return "UserResponseDetails [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", phone=" + phone + ", role=" + role + ", booking=" + booking + ", review=" + review + "]";
	}

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

	public List<BookingResponse> getBooking() {
		return booking;
	}

	public void setBooking(List<BookingResponse> booking) {
		this.booking = booking;
	}

	public List<ReviewResponse> getReview() {
		return review;
	}

	public void setReview(List<ReviewResponse> review) {
		this.review = review;
	}
	
	
	

}
