package com.example.InterFace.Web.RequestDTO;

import java.time.LocalDateTime;

public class ReviewRequest {
	
	private int id;
	
	
	
	private int rating;
	
	private String comment;
	
	private LocalDateTime createdDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "ReviewRequest [id=" + id + ", rating=" + rating + ", comment=" + comment + ", createdDate="
				+ createdDate + "]";
	}

	
	
	
	
	

}
