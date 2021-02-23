import java.util.Date;
import java.time.*;

public class Reservation {
    Date date;
    LocalTime duration;
    Room room;

    public Reservation(Date date, LocalTime duration, Room room) {
        this.date = date;
        this.duration = duration;
        this.room = room;
    }
}