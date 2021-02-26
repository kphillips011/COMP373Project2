import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class MaintenanceRequest extends Maintenance {
    boolean accepted = false;

    public MaintenanceRequest(Facility facility, String details, int cost, Date date, LocalTime dur, Room room) {
        super(facility, details, cost, date, dur, room);
    }

    public Maintenance scheduleMaintenance() {
        accepted = true;
        return this;
    }

    @Override
    public String toString() {
        if (accepted == false) {
            return "Request Information = \n" + "Accepted = false" + ", Facility = " + facility +
                    ", Details = " + details + ", Room = " + room;
        } else { return "Request Information = \n" + "Accepted = true, " + super.toString() ; }
    }
}