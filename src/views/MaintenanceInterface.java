import java.util.ArrayList;

public interface MaintenanceInterface {
    public boolean makeFacilityMaintRequest(); // in MaintenanceRequest, gather details of a maintenance request and set
                                                    // 'accepted' to false. Changed to boolean instead of returning Maintenance obj
    public Maintenance scheduleMaintenance(); // create a new Maintenance object in MaintenanceRequest where accepted == true and
                                                // completed == false
    public int calcMaintenanceCostForFacility(); // based upon the whole facility - calculate total cost from all maintenance objects
    public float calcProblemRateForFacility(); // based upon the whole facility - calculate ratio of not completed maintenance objects to
                                                // completed maintenance objects
    public int calcDownTimeForFacility(); // based upon the whole facility - calculate total duration from all maintenance objects?
    public ArrayList<MaintenanceRequest> listMaintRequests(); // list all Maintenance Requests
    public Maintenance listMaintenance(); // list details of a specific Maintenance object
    public ArrayList<Maintenance> listFacilityProblems(); // I think this should list all Maintenance objects where completed == False
}