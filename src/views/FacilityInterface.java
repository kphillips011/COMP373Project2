import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public interface FacilityInterface  {
    public String getFacilityInformation(); // returns details for a facility
    public int requestAvailableCapacity(); // returns available capacity for a facility
    public void addFacilityDetails(String details);
    public boolean vacateFacility();
    public double calcMaintenanceCostForFacility();
    public float calcProblemRateForFacility();
    public int calcDownTimeForFacility();
    public ArrayList<Maintenance> listFacilityProblems();
    public boolean makeFacilityMaintRequest(String details, double cost, Date date, LocalTime dur, Room room);
    public ArrayList<MaintenanceRequest> listMaintRequests();
}