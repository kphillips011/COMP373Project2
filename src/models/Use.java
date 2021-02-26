import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Use implements UseInterface {
    String details;
    boolean inUse = false;
    Facility facility; Date date; LocalTime duration; Room room;

    public Use(String details, Date date, LocalTime duration, Room room, Facility facility) {
        //super(date, duration, room, facility);
        inUse = true;
        this.details = details;
        this.facility = facility; this.date = date; this.duration = duration; this.room = room;
    }

    @Override
    public boolean isInUseDuringInterval() { return inUse; } //returns if facility is in use

    @Override
    public boolean assignFacilityToUse(Facility facility)
    {
    inUse = true;
    return inUse;
    }

    @Override
    public float calcUsageRate() {
        // TODO
        return 0;
    }

}