import java.util.ArrayList;

public interface MaintenanceInterface {
    public Maintenance listMaintenance(); // list specific maintenance object
    public float getMaintenanceCost(); // returns cost associated with maintenance object
    public boolean isCompleted(); // returns whether the maintenance is completed
    public String toString();
}