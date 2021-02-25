import java.util.ArrayList;

public interface FacilityInterface  {
    public ArrayList<Facility> listFacilities();
    public String getFacilityInformation();
    public int requestAvailableCapacity();
    public void addNewFacility();
    public void addFacilityDetail();
    public Facility removeFacility();
    public Facility vacateFacility(); //Moved this from Use to Facilities because you can create a method under facilities
}