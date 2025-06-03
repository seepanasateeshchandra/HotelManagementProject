package com.example.InterFace.Web.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InterFace.Web.Entity.*;

import com.example.InterFace.Web.Repository.RoomRepository;
import com.example.InterFace.Web.RequestDTO.RoomRequest;
import com.example.InterFace.Web.Response.*;

import java.util.*;

@Service
public class AdminService {
	
	@Autowired
	RoomRepository roomRepository;
	

	public String addRoomDetails(RoomRequest room) {
		
		RoomDetails roomDetails = new RoomDetails();
		
		roomDetails.setAvaliable(room.getAvaliable());
		roomDetails.setPricePerNight(room.getPricePerNight());
		roomDetails.setRoomNumber(room.getRoomNumber());
		
		RoomType roomType = new RoomType();
		
		roomType.setDescription(room.getRoomType().getDescription());
		
		roomType.setName(room.getRoomType().getName());
		
		roomDetails.setRoomType(roomType);
		
		roomRepository.save(roomDetails);
		
		
		
		
		
		
		// TODO Auto-generated method stub
		return "Room Details Creatded successFully";
	}


	public List<RoomResponse> getAllRoomDetails() {
		// TODO Auto-generated method stub
		List<RoomResponse> allRequestRooms = new ArrayList<>();
		
		List<RoomDetails> allRoomsDetails = roomRepository.findAll();
		
		
		for(RoomDetails room : allRoomsDetails) {
			
			RoomResponse requestRoom = new RoomResponse();
			
			requestRoom.setId(room.getRoomId());
			requestRoom.setPricePerNight(room.getPricePerNight());
			requestRoom.setRoomNumber(room.getRoomNumber());
			requestRoom.setAvaliable(room.isAvaliable());
			
			
			RoomTypeResponse response = new RoomTypeResponse();
			
			response.setId(room.getRoomType().getRoomTypeId());
			response.setDescription(room.getRoomType().getDescription());
			response.setName(room.getRoomType().getName());
			
			requestRoom.setRoomType(response);
			
			allRequestRooms.add(requestRoom);
			
		}
		
		return allRequestRooms;
	}


	public RoomResponse getRoomDetailsById(Long id) {
		// TODO Auto-generated method stub
		RoomResponse result = null;
		
		RoomDetails details = roomRepository.findById(id).get();
		
		if(details != null) {
			
			result = new RoomResponse();
			
			result.setId(details.getRoomId());
			result.setAvaliable(details.isAvaliable());
			result.setPricePerNight(details.getPricePerNight());
			result.setRoomNumber(details.getRoomNumber());
			
			RoomTypeResponse response = new RoomTypeResponse();
			
			response.setId(details.getRoomType().getRoomTypeId());
			response.setDescription(details.getRoomType().getDescription());
			response.setName(details.getRoomType().getName());
			
			result.setRoomType(response);
			
			return result;
			
		}else {
			
			return result;
		}
		
		
		
		
		
	}


	
	
	
	
	
	public String deleteRoomDetailsById(Long id) {
		
		RoomDetails details = roomRepository.findById(id).get();
		
		if(details != null) {
			
			roomRepository.deleteById(id);
			
			return "Room Details Deleted successfully";
			
		}else {
			
			
			return "Room Details are Not Existded";
			
		}
		
		
	}


	public String updateRoomDetailsById(Long id, RoomRequest room) {
		// TODO Auto-generated method stub
		RoomDetails details = roomRepository.getReferenceById(id);
		
		
		System.out.println(details);
		
		
		if(details != null) {
			
			details.setPricePerNight(room.getPricePerNight());
			details.setRoomNumber(room.getRoomNumber());
			
			
			roomRepository.save(details);
			
			
			return "RoomDetails successfully Updated";
			
			
			
		}else {
			
			return "room details are not existded";
		}
		
		
		
		
		
	}
	
	
	
	
	
	   

}
