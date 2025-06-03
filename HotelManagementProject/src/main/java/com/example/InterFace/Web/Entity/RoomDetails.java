package com.example.InterFace.Web.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class RoomDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long roomId;
	@Column
	private String roomNumber;
	
	@ManyToOne(cascade = CascadeType.ALL )
	@JoinColumn
	private RoomType roomType;
	@Column
	private int pricePerNight;
	
	
	
	private String isAvaliable;
	
	
	


	public Long getRoomId() {
		return roomId;
	}


	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}


	public String getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}


	public RoomType getRoomType() {
		return roomType;
	}


	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}


	public int getPricePerNight() {
		return pricePerNight;
	}


	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}


	

	public String isAvaliable() {
		return isAvaliable;
	}


	public void setAvaliable(String isAvaliable) {
		this.isAvaliable = isAvaliable;
	}


	@Override
	public String toString() {
		return "RoomDetails [roomId=" + roomId + ", roomNumber=" + roomNumber + ", roomType=" + roomType
				+ ", pricePerNight=" + pricePerNight + ", isAvaliable=" + isAvaliable + "]";
	}
	
	


	
	
	
	
	
	

}
