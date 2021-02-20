public interface UseView {
    public boolean isInUseDuringinterval();
    public assignFacilityToUse();
    public Facility vacateFacility();
    public ArrayList<Maintenance> listInspections(); //I think this should display all Maintenance objects with type == "inspection"
    public ArrayList<Use> listActualUsage();
    public float calcUsageRate();
}