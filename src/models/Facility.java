import java.util.ArrayList;

public class Facility{
    ArrayList<Building> buildings;
    String facilityName;
    int facilityID;
    String details;

    public void addFacilityDetails(String details){
        //adds new lines to break each set of details up, then adds new information at the bottom.
        this.details.concat("\n\n" + details);
    }

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

    // based upon the whole facility - calculate total cost from all maintenance objects, whether completed or not
    public int calcMaintenanceCostForFacility() {
        int facilityMaintenanceCost = 0;
        for (MaintenanceRequest mr : this.listMaintRequests()) {
            if (mr.listMaintenance() != null) {
                Maintenance m = mr.listMaintenance();
                facilityMaintenanceCost += m.getMaintenanceCost();
            }
        }
        return facilityMaintenanceCost;
    }
    // based upon the whole facility - calculate ratio of not completed maintenance objects to
    // all maintenance objects
    public float calcProblemRateForFacility() {
        // TODO
        float incomplete = 0; float total = 0;
        for (MaintenanceRequest mr : this.listMaintRequests()) {

        }

        return 0;
    }
    // based upon the whole facility - calculate total duration from all maintenance objects
    // assuming 'down time' mean any time a specific facility goes under maintenance
    public int calcDownTimeForFacility() {
        // TODO
        return 0;
    }
    // I think this should list all Maintenance objects where completed == False
    public ArrayList<Maintenance> listFacilityProblems() {
        // TODO
        return null;
    }

    // list all Maintenance Requests for a facility
    public ArrayList<MaintenanceRequest> listMaintRequests() {
        ArrayList<MaintenanceRequest> requestList = new ArrayList<MaintenanceRequest>();
        // TODO
        return requestList;
    }

}