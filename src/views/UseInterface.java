import java.util.ArrayList;

public interface UseInterface {
    public boolean isInUseDuringinterval();
    public boolean assignFacilityToUse();
    public Facility vacateFacility();
    public ArrayList<Inspection> listInspections();
    public ArrayList<Use> listActualUsage();
    public float calcUsageRate();
}