import java.util.ArrayList;
import java.util.List;

public class FacilityManager{
    ArrayList<Facility> facilities;

    public ArrayList<Facility> getFacilities(){
        return this.facilities;
    }

    public ArrayList<Facility> addNewFacility(Facility newFacility){
        this.facilities.add(newFacility);
        return facilities;
    }

    public void removeFacility(Facility facility){ this.facilities.remove(facility); }

    // list all Maintenance Requests for ALL facilities by Facility ID
    public ArrayList<MaintenanceRequest> listMaintRequests() {
        ArrayList<MaintenanceRequest> requestList = new ArrayList<MaintenanceRequest>();
        // TODO
        return requestList;
    }


}