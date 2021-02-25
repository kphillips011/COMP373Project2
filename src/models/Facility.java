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

    // based upon the whole facility - calculate total cost from all maintenance objects
    public int calcMaintenanceCostForFacility() {
        // TODO
        return 0;
    }
    // based upon the whole facility - calculate ratio of not completed maintenance objects to
    // completed maintenance objects
    public float calcProblemRateForFacility() {
        // TODO
        return 0;
    }
    // based upon the whole facility - calculate total duration from all maintenance objects?
    public int calcDownTimeForFacility() {
        // TODO
        return 0;
    }
    // I think this should list all Maintenance objects where completed == False
    public ArrayList<Maintenance> listFacilityProblems() {
        // TODO
        return null;
    }

}