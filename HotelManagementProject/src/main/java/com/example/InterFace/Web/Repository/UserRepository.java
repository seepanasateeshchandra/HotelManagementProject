package com.example.InterFace.Web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.InterFace.Web.Entity.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Long> {
	
	
	UserDetails getByEmailIdAndRole(String emailId,String role);
	
	
	UserDetails findByUserIdAndEmailId(int id,String password);
	
	
	void deleteByUserIdAndEmailId(int id,String password);

}
