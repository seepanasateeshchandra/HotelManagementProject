package com.example.InterFace.Web.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.InterFace.Web.RequestDTO.UserRequestDetails;
import com.example.InterFace.Web.RequestDTO.UserUpdatedetails;
import com.example.InterFace.Web.Response.UserResponseDetails;
import com.example.InterFace.Web.Service.UserService;


@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping(path="/user/Registration")
	public String UserRegistration(@RequestBody UserRequestDetails user ) {
		
		
		System.out.println(user);
		
		String result = service.addUser(user);
		
		
		return result;
		
	}
	
	@GetMapping(path="/get/userDetails/{Id}")
	public UserResponseDetails userGetById(@PathVariable Long Id) {
		
		UserResponseDetails user = service.getUserById(Id);
		
		
		return user;
		
	}
	
	
	
	@PutMapping(path="/update/userDetailsById/{Id}/EmailId/{emailId}/byRole/{role}")
	public String updateUserDetails(@RequestBody UserUpdatedetails user,@PathVariable Long Id ,@PathVariable String emailId,@PathVariable String role) {
		
		
		String result = service.updateUserByEmailIdAndRole(user,Id,emailId,role);
		
		System.out.println(user);
		
		return result;
		
	}
	
	@Modifying
	@Transactional
	@DeleteMapping(path="/delete/userById/{id}/emailId/{emailId}")
	public String deleteUser(@PathVariable int id,@PathVariable String emailId) {
		
		System.out.println(id);
		
		System.out.println(emailId);
		
		String result = service.deleteByIdAndPassword(id,emailId);
		return result;
		
	}

}
