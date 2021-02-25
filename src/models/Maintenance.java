import java.rmi.server.RemoteServer;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Maintenance extends Reservation {
    String details;
    boolean completed;
    int cost;
    Facility facility;

    public Maintenance(Facility facility, String details, int cost, Date date, LocalTime dur, Room room) {
        super(date, dur, room);
        this.facility = facility; this.details = details; this.cost = cost;
        completed = false;
    }

    public int getMaintenanceCost() { return cost; }

    public boolean isCompleted() { return completed; }

    public String toString() {
        return "Facility + " + facility + ", Description = " + details + ", " +
                "Date accepted = " + date + ", Duration = " + duration +
                ", Room Number = " + room + ", Completed = " + completed;
    }
}