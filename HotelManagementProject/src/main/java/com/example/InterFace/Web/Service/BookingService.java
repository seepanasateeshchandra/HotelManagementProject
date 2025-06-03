package com.example.InterFace.Web.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InterFace.Web.Repository.BookingRepository;
import com.example.InterFace.Web.RequestDTO.BookingRequest;
import com.example.InterFace.Web.Response.BookingResponse;
import com.example.InterFace.Web.Response.PaymentResponse;
import com.example.InterFace.Web.Response.RoomResponse;
import com.example.InterFace.Web.Response.RoomTypeResponse;
import com.example.InterFace.Web.Entity.*;

@Service
public class BookingService {
	
	@Autowired
	BookingRepository repository;

	public String addBooking(BookingRequest request) {
		
		Booking book = new Booking();
		
		book.setBookingId(request.getId());
		book.setCheckInDate(request.getCheckInDate());
		book.setCheckOutDate(request.getCheckOutDate());
		book.setStatus(request.getStatus());
		book.setTotalPrice(request.getTotalPrice());
		
		RoomDetails room = new RoomDetails();
		
		room.setPricePerNight(request.getRoom().getPricePerNight());
		
		room.setAvaliable(request.getRoom().getAvaliable());
		
		room.setRoomNumber(request.getRoom().getRoomNumber());
		
		RoomType requestRoom  = new RoomType();
		
		requestRoom.setName(request.getRoom().getRoomType().getName());
		
		requestRoom.setDescription(request.getRoom().getRoomType().getDescription());
		
		room.setRoomType(requestRoom);
		
		book.setRoom(room);
		
		
		
		Payment payment = new Payment();
		
		payment.setPaymentDate(request.getPayment().getPaymentDate());
		
		payment.setPaymentMethod(request.getPayment().getPaymentMethod());
		
		payment.setTransactionId(request.getPayment().getTransactionId());
		
		
		payment.setPaymentStatus(request.getPayment().getPaymentStatus());
		
		
		
		book.setPayment(payment);
		
		
		
		
		repository.save(book);
		
		
		
		
		
	
		
		
		return "Booking add successfully";
	}

	public List<BookingResponse> getAllBooking() {
		// TODO Auto-generated method stub
		
		List<BookingResponse> bookingResponse = new ArrayList<>();
		
		List<Booking> bookingEntity = repository.findAll();		
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
		
		
		
		
		return bookingResponse;
	}

	public BookingResponse getBookingByuserId(int id) {
		// TODO Auto-generated method stub
		
		
		
		Booking book = repository.findById(id).get();
		
		BookingResponse response = null;
		
		
		if(book != null) {
		 response = new BookingResponse();
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
		
		
		
		
		return response;
		}else {
			
			return response;
		}
	}

	public String cancelBooking(int id) {
		// TODO Auto-generated method stub
		
		Booking book = repository.findById(id).get();
		
		
		if(book != null) {
			
			repository.deleteById(id);
			
			
			return "booking successfully deleteded";
		}else {
			
			return "booking not existded";
		}
		
		
		
		
	}
	
	
	
	
	

}
