package com.example.InterFace.Web.Controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.InterFace.Web.RequestDTO.RoomRequest;
import com.example.InterFace.Web.Response.RoomResponse;
import com.example.InterFace.Web.Service.AdminService;

@RestController
public class AdminController {
	
	
	@Autowired
	AdminService admin;
	
	
	
	@PostMapping("admin/addRoomDetails")
	public String addRoomDetails(@RequestBody RoomRequest room) {
		
		System.out.println(room);
		
		
		String result = admin.addRoomDetails(room);
		
		
		return result;
		
	}
	
	
	@GetMapping("admin/getAllRoomDetails")
	public List<RoomResponse> viewAllRoomDetails() {
		
		
		return admin.getAllRoomDetails();
		
		
		
		
		
		
	}
	
	
	
	@GetMapping("admin/getRoomDetailsById/{id}")
	public RoomResponse viewRoomDetailsById(@PathVariable Long id) {
		
		
		return admin.getRoomDetailsById(id);
		
		
		
		
	}
	
	
	
	
	

	
	
	
	@PutMapping("admin/updateRoomDetails/{id}")
	public String updateRoomDetailsById(@PathVariable Long id,@RequestBody RoomRequest room) {
		
		System.out.println(id);
		System.out.println(room);
		
		String result = admin.updateRoomDetailsById(id,room);
		
		return result;
		
	}
	
	@DeleteMapping("admin/deleteRoomDetails/{id}")
	public String deleteRoomDetailsById(@PathVariable Long id) {
		
		
		String result = admin.deleteRoomDetailsById(id);
		return result;
	}
	
	

}
