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

import com.example.InterFace.Web.RequestDTO.BookingRequest;
import com.example.InterFace.Web.Response.BookingResponse;
import com.example.InterFace.Web.Service.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	BookingService service;
	
	
	
	@PostMapping(path="add/userBooking")
	public String addBooking(@RequestBody BookingRequest request) {
		
		
		return service.addBooking(request);
		
	}
	
	@GetMapping("get/allBookings")
	public List<BookingResponse> getAllBookings(){
		
		
		return service.getAllBooking();
		
	}
	
	
	@GetMapping("getBookingByUserId/{id}")
	public BookingResponse getBookingResponseById(@PathVariable int id) {
		
		
		return service.getBookingByuserId(id);
		
	}
	
	
	@DeleteMapping("deleteBookingByUserId/{id}")
	public String cancelBookingBYId(@PathVariable int id) {
		
		return service.cancelBooking(id);
	}

}
