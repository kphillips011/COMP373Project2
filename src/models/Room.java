public class Room {
    String roomID; //will be composed of building code and room number. Example: Cuneo 313 -> 001313 if Cuneo has building code 001
	int roomNumber;
	String buildingName;
	int capacity;
	boolean inUse;
	boolean inMaintenance;

	public Room Room(Building building, int capacity, int roomNumber){
		this.roomID = String.concat(String(building.buildingID), String(roomNumber));
		this.roomNumber = roomNumber;
		this.buildingName = building.buildingName;
		this.capacity = capacity;
		this.inUse = false;
		this.inMaintenance = false;
	}

	public int requestAvailableCapacity(){
		//get capacity attribute that was defined on construction of the object.
		return this.capacity;
	}
}
