import java.rmi.server.RemoteServer;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Maintenance extends Reservation {
    String details;
    boolean completed;
    float cost;

    public Maintenance(String d, float c, Date date, LocalTime dur, Room room) {
        super(date, dur, room);
        completed = false;
        details = d;
        cost = c;
    }

    public boolean isCompleted() { return completed; }

}