package com.example.InterFace.Web.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.InterFace.Web.RequestDTO.ReviewRequest;
import com.example.InterFace.Web.Response.ReviewResponse;
import com.example.InterFace.Web.Service.ReviewService;

@RestController
public class ReviewController {
	
	
	@Autowired
	ReviewService service;
	
	
	
	@PostMapping("addReviewByUserId/{id}")
	public String addReviewToCustmour(@RequestBody ReviewRequest request,@PathVariable int id ) {
		
		
		return service.addReview(request,id);
		
		
		
		
	}
	
	@GetMapping("/getAllReview")
	public List<ReviewResponse> getAllReviews(){
		
		
		return service.getAllReviews();
		
	}
	
	
	@GetMapping("/getReviewByUserId/{id}")
	public ReviewResponse getReviewByUserId(@PathVariable int id) {
		
		
		return service.getReviewByUserId(id);
		
		
		
	}
	
	
	
	@PostMapping("/updateReview/{id}")
	public String updateReview(@PathVariable int id,@RequestBody ReviewRequest review) {
		
		return service.updateReview(id,review);
		
		
	}
	
	
	@DeleteMapping("/deleteReview/{id}")
	public String deleteReview(@PathVariable int id) {
		
		
		return service.deleteReviewById(id);
		
	}
	
	
	
	
}


