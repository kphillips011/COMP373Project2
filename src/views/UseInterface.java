import java.util.ArrayList;

public interface UseInterface {
    public boolean isInUseDuringInterval(); // to check if a room/facility is in use
    public boolean assignFacilityToUse(Facility facility); // Assigning a facility to whether or not it is in use
    public float calcUsageRate(); // used to find how often/how much a facility/room/building is used.
}