import java.rmi.server.RemoteServer;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Maintenance extends Reservation {
    String details;
    boolean completed;
    int cost;

    public Maintenance(String details, int cost, Date date, LocalTime dur, Room room) {
        super(date, dur, room);
        completed = false;
        this.details = details;
    }

    public int getMaintenanceCost() { return cost; }

    public boolean isCompleted() { return completed; }

}