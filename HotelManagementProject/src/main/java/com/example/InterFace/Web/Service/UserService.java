package com.example.InterFace.Web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InterFace.Web.Entity.UserDetails;
import com.example.InterFace.Web.Repository.BookingRepository;
import com.example.InterFace.Web.Repository.PaymentRepository;
import com.example.InterFace.Web.Repository.ReviewRepository;
import com.example.InterFace.Web.Repository.RoomRepository;
import com.example.InterFace.Web.Repository.RoomTypeRepository;
import com.example.InterFace.Web.Repository.UserRepository;
import com.example.InterFace.Web.RequestDTO.BookingRequest;
import com.example.InterFace.Web.RequestDTO.ReviewRequest;
import com.example.InterFace.Web.RequestDTO.UserRequestDetails;
import com.example.InterFace.Web.RequestDTO.UserUpdatedetails;

import java.util.*;
import com.example.InterFace.Web.Entity.*;
import com.example.InterFace.Web.Response.*;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	@Autowired
	BookingRepository booking;
	@Autowired
	PaymentRepository payment;
	@Autowired
	RoomRepository room;
	
	@Autowired
	ReviewRepository review;
	
	@Autowired
	RoomTypeRepository type;
	
	
	
	
	

	public String addUser(UserRequestDetails user) {
		// TODO Auto-generated method stub
		
		UserDetails newUser = new UserDetails();
		
		newUser.setUserName(user.getName());
		newUser.setEmailId(user.getEmail());
		newUser.setPassword(user.getPassword());
		newUser.setPhone(user.getPhone());
		newUser.setRole(user.getRole());
		
		List<Booking> NewbookingList = new ArrayList<>();
		
		List<BookingRequest>  bookingRequests = user.getBooking();
		
		
		for(BookingRequest book : bookingRequests) {
			Booking newBook = new Booking();
			
			newBook.setCheckInDate(book.getCheckInDate());
			newBook.setCheckOutDate(book.getCheckOutDate());
			newBook.setStatus(book.getStatus());
			newBook.setTotalPrice(book.getTotalPrice());
			Payment newPayment = new Payment();
			
			newPayment.setPaymentDate(book.getPayment().getPaymentDate());
			newPayment.setPaymentMethod(book.getPayment().getPaymentMethod());
			newPayment.setPaymentStatus(book.getPayment().getPaymentStatus());
			newPayment.setTransactionId(book.getPayment().getTransactionId());
			
			RoomDetails room = new RoomDetails();
			
			
			room.setAvaliable(book.getRoom().getAvaliable());
			room.setPricePerNight(book.getRoom().getPricePerNight());
			room.setRoomNumber(book.getRoom().getRoomNumber());
			
			RoomType roomType = new RoomType();
			
			roomType.setName(book.getRoom().getRoomType().getName());
			roomType.setDescription(book.getRoom().getRoomType().getDescription());
			
			
			room.setRoomType(roomType);
			
			
			newBook.setPayment(newPayment);
			newBook.setRoom(room);
			
			
			NewbookingList.add(newBook);
			
		}
			
			
			List<ReviewRequest>  requestReview = user.getReview();
			
			List<Review> reviewEntity = new ArrayList<>();
			
			for(ReviewRequest request :requestReview ) {
				
				
				Review entityReview = new Review();
				
				entityReview.setRating(request.getRating());
				entityReview.setCreatedDate(request.getCreatedDate());
				entityReview.setComment(request.getComment());
				
				reviewEntity.add(entityReview);
			}
			
			
			
			
		
		
		newUser.setReview(reviewEntity);
		
		newUser.setBooking(NewbookingList);
		
		
		
		userRepository.save(newUser);
		
		
		
		return "User Created successfully";
	}






	public UserResponseDetails getUserById(Long id) {
		// TODO Auto-generated method stub
		
	UserDetails user	 = userRepository.findById(id).get();
	
	
	UserResponseDetails userResponse = new UserResponseDetails();
	
	userResponse.setId(user.getUserId());
	userResponse.setName(user.getUserName());
	userResponse.setEmail(user.getEmailId());
	userResponse.setPassword(user.getPassword());
	userResponse.setPhone(user.getPhone());
	userResponse.setRole(user.getRole());
	
	List<BookingResponse> bookingResponse = new ArrayList<>();
	
	List<Booking> bookingEntity = user.getBooking();
	
	for(Booking book : bookingEntity) {
		
		BookingResponse response = new BookingResponse();
		response.setId(book.getBookingId());
		response.setStatus(book.getStatus());
		response.setTotalPrice(book.getTotalPrice());
		response.setCheckInDate(book.getCheckInDate());
		response.setCheckOutDate(book.getCheckOutDate());
		
		PaymentResponse payment = new PaymentResponse();
		
		payment.setId(book.getPayment().getPaymentId());
		payment.setPaymentDate(book.getPayment().getPaymentDate());
		payment.setPaymentMethod(book.getPayment().getPaymentMethod());
		payment.setPaymentStatus(book.getPayment().getPaymentStatus());
		payment.setTransactionId(book.getPayment().getTransactionId());
		
		response.setPayment(payment);
		
		
		
		RoomResponse room = new RoomResponse();
		
		
		room.setId(book.getRoom().getRoomId());
		
		room.setPricePerNight(book.getRoom().getPricePerNight());
		
		room.setAvaliable(book.getRoom().isAvaliable());
		
		room.setRoomNumber(book.getRoom().getRoomNumber());
		
		
		RoomTypeResponse roomType = new RoomTypeResponse();
		
		roomType.setId(book.getRoom().getRoomType().getRoomTypeId());
		roomType.setName(book.getRoom().getRoomType().getName());
		roomType.setDescription(book.getRoom().getRoomType().getDescription());
		
		room.setRoomType(roomType);
		
		
		response.setRoom(room);
		
		bookingResponse.add(response);
		
		
		
		
	}
	
	userResponse.setBooking(bookingResponse);
	
	List<ReviewResponse> reviewResponse = new ArrayList<>();
	
	
	List<Review> reviewEntity = user.getReview();
	
	
	for(Review review : reviewEntity) {
		
		ReviewResponse reviewResponse1  = new ReviewResponse();
		
		reviewResponse1.setId(review.getReviewId());
		reviewResponse1.setComment(review.getComment());
		reviewResponse1.setCreatedDate(review.getCreatedDate());
		reviewResponse1.setRating(review.getRating());
		
		reviewResponse.add(reviewResponse1);
		
	}
	
	
	userResponse.setReview(reviewResponse);
	
	
	
	
	return userResponse;
	//System.out.println(user);
		
	}






	public String updateUserByEmailIdAndRole(UserUpdatedetails userUpdate, Long id, String emailId, String role) {
		
		
		
		UserDetails user = userRepository.getByEmailIdAndRole(emailId, role);
		
		if(user != null) {
			
			
			
			
			
			user.setEmailId(userUpdate.getEmail());
			user.setPassword(userUpdate.getPassword());
			user.setPhone(userUpdate.getPhone());
			user.setUserName(userUpdate.getName());
			
			
			userRepository.save(user);
			
			
			
			
			
			
			return "user updated successfully";
			
		}else {
			
			return "user Not Existeded ! please provide Correct User Details";
		}
		
		
		
		
		
		// TODO Auto-generated method stub
		
	}






	public String deleteByIdAndPassword(int id, String emailId) {
		// TODO Auto-generated method stub
		UserDetails user = userRepository.findByUserIdAndEmailId(id, emailId);
		
		
		if(user != null) {
			
			userRepository.deleteByUserIdAndEmailId(id, emailId);
			
			return "User successfully Deleted";
		}else {
			
			return "User Details Not Existeded";
		}
		
		
	}
	
	

}
