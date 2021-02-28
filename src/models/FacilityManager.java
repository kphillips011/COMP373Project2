//package models;

import java.util.ArrayList;

public class FacilityManager {
    ArrayList<Facility> facilities;

    // note: changed from getFacilities() to listFacilities()
    public ArrayList<Facility> listFacilities(){
        return this.facilities;
    }

    public ArrayList<Facility> addNewFacility(Facility newFacility){
        this.facilities.add(newFacility);
        return facilities;
    }

    public void removeFacility(Facility facility){ this.facilities.remove(facility); }

    // Returns an ArrayList with all Use objects across all facilities
    public ArrayList<Use> listActualUsage() {
        ArrayList<Use> allActualUsage = new ArrayList<Use>();
        for (Facility f : this.facilities) {
            for (Use u : f.actualUsage ) { allActualUsage.add(u); }
        }
        return allActualUsage;
    }

    // Lists all inspections across all facilities
    public ArrayList<Maintenance.Inspection> listInspections() {
        ArrayList<Maintenance.Inspection> allInspection = new ArrayList<Maintenance.Inspection>();
        for (Facility f : this.facilities) {
            for (Maintenance.Inspection i : f.inspections ) { allInspection.add(i); }
        }
        return allInspection;
    }

    // List all MaintenanceRequest objects where completed == False
    public ArrayList<MaintenanceRequest> listAllFacilityProblems() {
        ArrayList<MaintenanceRequest> allProblems = new ArrayList<MaintenanceRequest>();
        for (Facility f : this.facilities) {
            for (MaintenanceRequest mr : f.requestedMaintenance ) {
                if (!(mr.isCompleted())) { allProblems.add(mr); }
            }
        }
        return allProblems;
    }
}