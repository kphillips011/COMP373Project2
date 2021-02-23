import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class MaintenanceRequest {
    boolean accepted;
    String details;
    Maintenance maintenance;

    public Maintenance makeFacilityMaintRequest(String d, float c, Date date, LocalTime dur, Room room) {
        accepted = true;
        details = d;
        maintenance = new Maintenance(d, c, date, dur, room);
    }


}