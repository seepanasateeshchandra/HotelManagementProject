package com.example.InterFace.Web.Response;



public class RoomResponse {
	
private Long id;
	
	private String roomNumber;
	
	private RoomTypeResponse roomType;
	
	private int pricePerNight;
	
	private String isAvaliable;

	public Long getId() {
		return id;
	}

	public void setId(Long long1) {
		this.id = long1;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public RoomTypeResponse getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomTypeResponse roomType) {
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
		return "RoomResponse [id=" + id + ", roomNumber=" + roomNumber + ", roomType=" + roomType + ", pricePerNight="
				+ pricePerNight + ", isAvaliable=" + isAvaliable + "]";
	}

	
	

}
