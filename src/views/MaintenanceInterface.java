import java.util.ArrayList;

public interface MaintenanceInterface {
    public Maintenance makeFacilityMaintRequest();
    public Maintenance scheduleMaintenance();
    public int calcMaintenanceCostForFacility();
    public float calcProblemRateForFacility();
    public int calcDownTimeForFacility();
    public ArrayList<MaintenanceRequest> listMaintRequests();
    public Maintenance listMaintenance();
    public ArrayList<Maintenance> listFacilityProblems(); // I think this should list all Maintenance objects where completed == False
}