import java.util.Date;
import java.time.*;

public class Reservation {
    Date date;
    LocalTime duration;
    Room room;
    Facility facility;

    public Reservation(Date date, LocalTime duration, Room room, Facility facility) {
        this.date = date; this.duration = duration; this.room = room; this.facility = facility;
    }

    public Reservation() {
        // TODO build default constructor with default values
    }
}