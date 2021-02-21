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
}