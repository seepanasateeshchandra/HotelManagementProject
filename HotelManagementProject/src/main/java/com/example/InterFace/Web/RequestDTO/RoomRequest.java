package com.example.InterFace.Web.RequestDTO;

import java.util.List;

public class RoomRequest {
	
	private int id;
	
	private String roomNumber;
	
	private RoomTypeRequest roomType;
	
	private int pricePerNight;
	
	private String isAvaliable;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public RoomTypeRequest getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomTypeRequest roomType) {
		this.roomType = roomType;
	}

	public int getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public String getAvaliable() {
		return isAvaliable;
	}

	public void setAvaliable(String isAvaliable) {
		this.isAvaliable = isAvaliable;
	}

	@Override
	public String toString() {
		return "RoomRequest [id=" + id + ", roomNumber=" + roomNumber + ", roomType=" + roomType + ", pricePerNight="
				+ pricePerNight + ", isAvaliable=" + isAvaliable + "]";
	}

	
	
	
	
	

}
