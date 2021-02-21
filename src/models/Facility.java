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

    public getFacilityInformation(){
        //returns a formatted String output of all attributes.
        ArrayList<String> buildingNames = new ArrayList<String>();
        for(Building b: this.buildings){
            buildingNames.add(b.buildingName)
        }
        return String.concat(this.facilityName, "\n\n", new String(this.facilityID),  "\n\n", buildingNames, "\n\n", this.details);
    }
}