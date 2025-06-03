package com.example.InterFace.Web.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long userId;
	@Column
	private String userName;
	@Column
	private String emailId;
	@Column
	private String password;
	@Column
	private String phone;
	@Column
	private String role;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<Booking> booking;
	
	@JoinColumn
	@OneToMany(cascade = CascadeType.ALL)
	private List<Review> review;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
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

	public List<Booking> getBooking() {
		return booking;
	}

	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}

	public List<Review> getReview() {
		return review;
	}

	public void setReview(List<Review> review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName + ", emailId=" + emailId + ", password="
				+ password + ", phone=" + phone + ", role=" + role + ", booking=" + booking + ", review=" + review
				+ "]";
	}
	
	
	

}
