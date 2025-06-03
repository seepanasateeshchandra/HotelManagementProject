package com.example.InterFace.Web.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InterFace.Web.Controller.ReviewController;
import com.example.InterFace.Web.Entity.Review;
import com.example.InterFace.Web.Repository.ReviewRepository;
import com.example.InterFace.Web.Repository.UserRepository;
import com.example.InterFace.Web.RequestDTO.ReviewRequest;
import com.example.InterFace.Web.Response.ReviewResponse;

@Service
public class ReviewService {
	@Autowired
	UserRepository userrepository;
	
	@Autowired
	ReviewRepository repository;

	 public String addReview(ReviewRequest request, int id) {
		// TODO Auto-generated method stub
		 
		 Review entityReview = new Review();
			
		entityReview.setRating(request.getRating());
		entityReview.setCreatedDate(request.getCreatedDate());
		entityReview.setComment(request.getComment());
		
		repository.save(entityReview);
		
		 
		 
		 
		return "Review Addeded successfully";
	}

	public List<ReviewResponse> getAllReviews() {
		// TODO Auto-generated method stub
		
		
		List<ReviewResponse> reviewResponse = new ArrayList<>();
		
		
		List<Review> reviewEntity = repository.findAll();
		
		
		for(Review review : reviewEntity) {
			
			ReviewResponse reviewResponse1  = new ReviewResponse();
			
			reviewResponse1.setId(review.getReviewId());
			reviewResponse1.setComment(review.getComment());
			reviewResponse1.setCreatedDate(review.getCreatedDate());
			reviewResponse1.setRating(review.getRating());
			
			reviewResponse.add(reviewResponse1);
			
		}
		
		
		return reviewResponse;
		
	}

	public ReviewResponse getReviewByUserId(int id) {
		// TODO Auto-generated method stub
		
		Review review = null;
		
		review = repository.findById(id).get();
		
		if(review != null) {
		
		
		ReviewResponse reviewResponse1  = new ReviewResponse();
		
		reviewResponse1.setId(review.getReviewId());
		reviewResponse1.setComment(review.getComment());
		reviewResponse1.setCreatedDate(review.getCreatedDate());
		reviewResponse1.setRating(review.getRating());
		
		return reviewResponse1;
		
		}else {
			
			
			return null;
			
		}
		
		
	}

	public String updateReview(int id, ReviewRequest review) {
		// TODO Auto-generated method stub
		Review reviewResponse = repository.findById(id).get();
		
		if(reviewResponse != null) {
			
			
			
			
			
			return "Review Successfully updated";
		}else {
			
			return "the user Not existeded";
		}
		
		
	}

	public String deleteReviewById(int id) {
		// TODO Auto-generated method stub
		
Review reviewResponse = repository.findById(id).get();
		
		if(reviewResponse != null) {
			repository.deleteById(id);
			
			return "Review Successfully deleted";
		}else {
			
			return "the user Not existeded";
		}
	}
	
	
	
	
	

}
