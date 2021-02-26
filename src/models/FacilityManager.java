import java.util.ArrayList;
import java.util.List;

public class FacilityManager {
    ArrayList<Facility> facilities;

    public ArrayList<Facility> listFacilities(){
        return this.facilities;
    } // changed from getFacilities() to listFacilities()

    public ArrayList<Facility> addNewFacility(Facility newFacility){
        this.facilities.add(newFacility);
        return facilities;
    }

    public void removeFacility(Facility facility){ this.facilities.remove(facility); }

    // TODO -- is this the right place
    public ArrayList<Use> listActualUsage() { return new ArrayList<Use>(); } // Lists all uses of rooms/facilities/buildings etc.

    // TODO -- is this the right place
    public ArrayList<Maintenance.Inspection> listInspections() { return new ArrayList<Maintenance.Inspection>(); } // Lists all information about inspection

    // TODO -- is this the right place
    // I think this should list all Maintenance objects where completed == False
    public ArrayList<Maintenance> listAllFacilityProblems() { return new ArrayList<Maintenance>(); }
}