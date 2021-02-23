import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class MaintenanceRequest {
    boolean accepted;
    String details;
    Date date; Room room; LocalTime duration; int cost;
    Maintenance maintenance;

    public boolean makeFacilityMaintRequest(String details, int cost, LocalTime dur, Date date, Room room) {
        this.details = details; this.date = date; this.room = room; this.duration = dur; this.cost = cost;
        accepted = false;
        return true;
    }

    public Maintenance scheduleMaintenance() {
        maintenance = new Maintenance(details, cost, date, duration, room);
        accepted = true;
        return maintenance;
    }

    public Maintenance listMaintenance() {
        return maintenance;
    }


}