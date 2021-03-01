package models;

import java.util.ArrayList;
import java.util.Date;

import views.FacilityInterface;

public class Facility implements FacilityInterface {
    ArrayList<Building> buildings;
    ArrayList<MaintenanceRequest> requestedMaintenance; // all MaintenanceRequest objects
    ArrayList<Use> actualUsage; // all use objects
    ArrayList<Maintenance.Inspection> inspections; // all inspection objects
    int facilityID;
    String facilityName;
    String details;

    public Facility(int facilityID, String facilityName, String details) {
        this.facilityID = facilityID;
        this.facilityName = facilityName;
        this.details = details;
        this.buildings = new ArrayList<Building>();
        this.requestedMaintenance = new ArrayList<MaintenanceRequest>();
        this.actualUsage = new ArrayList<Use>();
        this.inspections = new ArrayList<Maintenance.Inspection>();
    }

    @Override
    public String getFacilityInformation(){
        //returns a formatted String output of all attributes.
        ArrayList<String> buildingNames = new ArrayList<String>();
        String output = new String(this.facilityName);
        for(Building b: this.buildings){
            buildingNames.add(b.buildingName);
        }
        output.concat("\n\n" + String.valueOf(this.facilityID));
        output.concat(buildingNames.toString());
        output.concat(this.details);
        return output;
    }

    // Returns total available capacity for this facility
    @Override
    public int requestAvailableCapacity() {
        int capacity = 0;
        for (Building b : buildings) {
            for (Room r: b.rooms) {
                capacity += r.capacity;
            }
        }
        return capacity;
    }

    @Override
    public void addFacilityDetails(String details){
        //adds new lines to break each set of details up, then adds new information at the bottom.
        this.details.concat("\n\n" + details);
    }

    // Clears all maintenance, usage, and inspections for this facility
    @Override
    public boolean vacateFacility() {
        this.requestedMaintenance.clear();
        this.actualUsage.clear();
        this.inspections.clear();
        return true;
    }

    // Calculate total cost from all maintenance objects, whether completed or not
    @Override
    public double calcMaintenanceCostForFacility() {
        int facilityMaintenanceCost = 0;
        for (MaintenanceRequest mr : this.listMaintRequests()) {
            if (mr.listMaintenance() != null) {
                Maintenance m = mr.listMaintenance();
                facilityMaintenanceCost += m.getMaintenanceCost();
            }
        }
        return facilityMaintenanceCost;
    }


    // Calculate ratio of not completed maintenance objects to all maintenance objects
    @Override
    public float calcProblemRateForFacility() {
        float incomplete = this.listFacilityProblems().size();
        float total = this.listMaintRequests().size();
        return incomplete / total;
    }

    // Calculate total duration from all maintenance objects
    // assuming 'down time' mean any time a specific facility goes under maintenance
    @Override
    public int calcDownTimeForFacility() {
        int downTime = 0;
        for (MaintenanceRequest mr : this.listMaintRequests()) {
            downTime += mr.duration;
        }
        return downTime;
    }

    // List all Maintenance objects where completed == false
    @Override
    public ArrayList<Maintenance> listFacilityProblems() {
        ArrayList<Maintenance> problems = new ArrayList<Maintenance>();
        for (MaintenanceRequest mr : this.listMaintRequests()) {
            if (!(mr.isCompleted())) { problems.add(mr.listMaintenance()); }
        }
        return problems;
    }

    // Creates MaintenanceRequest object for this facility
    @Override
    public boolean makeFacilityMaintRequest(String details, double cost, Date date, double dur, Room room) {
        requestedMaintenance.add(new MaintenanceRequest(this, details, cost, date, dur, room));
        return true;
    }

    // List all Maintenance Requests for this facility
    @Override
    public ArrayList<MaintenanceRequest> listMaintRequests() {
        return this.requestedMaintenance;
    }

}