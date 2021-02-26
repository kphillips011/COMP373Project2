import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class MaintenanceRequest extends Maintenance {
    boolean accepted = false;
    Facility facility; String details; Room room;
    Maintenance maintenance;

    public boolean makeFacilityMaintRequest(Facility facility, String details, Room room) {
        this.facility = facility; this.details = details; this.room = room;
        return true;
    }

    public Maintenance scheduleMaintenance(Date date, LocalTime dur, int cost) {
        maintenance = new Maintenance(facility, details, cost, date, dur, room);
        accepted = true;
        return maintenance;
    }

    public Maintenance listMaintenance() { return maintenance; }

    public String toString() {
        if (accepted == false) {
            return "Request Information = \n" + "Accepted = false" + ", Facility = " + facility +
                    ", Details = " + details + ", Room = " + room;
        } else { return "Request Information = \n" + "Accepted = true, " + maintenance.toString() ; }
    }
}