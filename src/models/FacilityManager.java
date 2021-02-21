import java.util.ArrayList;

public class FacilityManager{
    ArrayList<Facility> facilities;

    public ArrayList<Facility> getFacilities(){
        return this.facilities
    }

    public ArrayList<Facility> addNewFacility(Facility newFacility){
        return this.facilities.add(newFacility);
    }

    public Facility removeFacility(Facility facility){
        return this.facilities.remove(facility);
    }
}