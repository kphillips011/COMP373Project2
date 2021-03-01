package views;

import java.util.ArrayList;
import models.*;

public interface FacilityInterface  {
    public String getFacilityInformation(); // returns details for a facility
    public int requestAvailableCapacity(); // returns available capacity for a facility
    public void addFacilityDetails(String details);
    public boolean vacateFacility();
    public double calcMaintenanceCostForFacility();
    public float calcProblemRateForFacility();
    public int calcDownTimeForFacility();
    public ArrayList<Maintenance> listFacilityProblems();
    public boolean makeFacilityMaintRequest(MaintenanceRequest mr);
    public ArrayList<MaintenanceRequest> listMaintRequests();
}