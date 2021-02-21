import java.util.ArrayList;

public class FacilityManager{
    ArrayList<Facility> facilities;

    public ArrayList<Facility> getFacilities(){
        return this.facilities;
    }

    public ArrayList<Facility> addNewFacility(Facility newFacility){
        this.facilities.add(newFacility);
        return facilities;
    }

    public void removeFacility(Facility facility){
        this.facilities.remove(facility);
    }
}