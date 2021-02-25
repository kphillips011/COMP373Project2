import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Use extends Reservation {
    String details;
    boolean inUse;
    Facility facility;

    public Use(String details, Date date, LocalTime duration, Room room, Facility facility) {
        super(date, duration, room, facility);
        inUse = true;
        this.details = details;
    }
    public boolean isInUseDuringinterval() { return inUse; } //returns if facility is in use

    public boolean assignFacilityToUse(Facility facility)
    {
    inUse = true;
    return inUse;
    }

    public float calcUsageRate() {
        // TODO
        return 0;
    }

}