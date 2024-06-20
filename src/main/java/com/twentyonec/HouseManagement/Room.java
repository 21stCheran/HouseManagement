package com.twentyonec.HouseManagement;

import com.twentyonec.HouseManagement.Utils.OccupancyType;

public class Room {
	
	private int roomID;
	private boolean booked;
	private OccupancyType occupancyType;
	private boolean isAC;
	private boolean isTV;
	private int basePrice = 500;
	private int deposit = 200;
	
	public Room() {
		
		
		this.setupRevenue();
	}
	
	private void setupRevenue() {
		if (isAC) {
			basePrice+= 200;
			deposit+= 100;
		}
		if (isTV) {
			basePrice+= 100;
		}
		
	}
	
	public int[] getPrice() {
		return new int[]{deposit, basePrice};
	}


}
