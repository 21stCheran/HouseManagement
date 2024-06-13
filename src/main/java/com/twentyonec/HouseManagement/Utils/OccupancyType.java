package com.twentyonec.HouseManagement.Utils;

public enum OccupancyType {
	
	Single("Single"),
	Double("Double"),
	Triple("Triple"),
	Quadruple("Quadruple");
	
	private final String occupancyType;
	
	OccupancyType(final String occupancyType) {
		this.occupancyType = occupancyType;
	}
	
	public String getCause() {
        return this.occupancyType;
    }

}
