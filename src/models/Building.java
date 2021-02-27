import java.util.ArrayList;

public class Building {
    int buildingID;
    String buildingName;
    String address;
    ArrayList<Room> rooms;

    public Building(int buildingID, String buildingName, String address, ArrayList<Room> rooms){
        this.buildingID = buildingID;
        this.buildingName = buildingName;
        this.address = address;
        this.rooms = rooms;
    }
}