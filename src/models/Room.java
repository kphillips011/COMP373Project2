package models;

public class Room {
    String roomID; // will be composed of building code and room number. Example: Cuneo 313 -> 001313 if Cuneo has building code 001
	int roomNumber;
	int capacity;
	boolean inUse;
	boolean inMaintenance;

	public Room(Building building, int capacity, int roomNumber){
		this.roomID = String.valueOf(building.buildingID).concat(String.valueOf(roomNumber));
		this.roomNumber = roomNumber;
		this.capacity = capacity;
		this.inUse = false;
		this.inMaintenance = false;
	}

	public int getRoomNumber() { return this.roomNumber; }
}
