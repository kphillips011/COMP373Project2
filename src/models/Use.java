import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Use extends Reservation {
    String details;
    boolean inUse;
    Facility facility;

    public Use(String details, Date date, LocalTime duration, Room room) {
        super(date, duration, room);
        inUse = true;
        this.details = details;
    }
    public boolean isInUseDuringinterval() { return inUse; } //returns if something is in Use

    public boolean assignFacilityToUse(Facility facility)
    {
    inUse = true;
    return inUse;
    }

}