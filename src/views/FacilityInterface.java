import java.util.ArrayList;

public interface FacilityInterface  {
    public String getFacilityInformation(); // returns details for a facility
    public int requestAvailableCapacity(); // returns available capacity for a facility
    public void addFacilityDetails(String details);
    public Facility vacateFacility();
    public int calcMaintenanceCostForFacility();
    public float calcProblemRateForFacility();
    public int calcDownTimeForFacility();
    public ArrayList<Maintenance> listFacilityProblems();
    public boolean makeFacilityMaintRequest();
    public ArrayList<MaintenanceRequest> listMaintRequests();
}