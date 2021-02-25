import java.util.ArrayList;

public interface UseInterface {
    public boolean isInUseDuringinterval(); // to check if a room/facility is in use
    public boolean assignFacilityToUse(); // Assigning a facility to whether or not it is in use
    public ArrayList<Inspection> listInspections(); //Lists all information about inspection
    public ArrayList<Use> listActualUsage(); // Lists all uses of rooms/facilities/buildings etc.
    public float calcUsageRate(); // It is used to find how often/how much a facility/room/building is used.
}