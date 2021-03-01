package views;

import java.util.ArrayList;

import models.Maintenance;

public interface MaintenanceInterface {
    public Maintenance listMaintenance(); // list specific maintenance object
    public double getMaintenanceCost(); // returns cost associated with maintenance object
    public boolean isCompleted(); // returns whether the maintenance is completed
    public String toString();


}