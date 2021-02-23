import java.util.Date;
import java.time.*;

public class Reservation {
    Date date;
    LocalTime duration;
    Room room;

    public Reservation(Date d, LocalTime dur, Room r) {
        date = d;
        duration = dur;
        room = r;
    }
}