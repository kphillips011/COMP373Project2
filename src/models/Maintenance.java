import java.rmi.server.RemoteServer;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Maintenance extends Reservation {
    String details;
    boolean completed;
    float cost;
    Facility facility;

    public Maintenance(Facility facility, String details, int cost, Date date, LocalTime dur, Room room) {
        super(date, dur, room, facility);
        this.facility = facility; this.details = details; this.cost = (dur.getHour() + dur.getMinute()/60) * 15;
        completed = false;
    }

    public float getMaintenanceCost() { return this.cost; }

    public boolean isCompleted() { return this.completed; }

    public String toString() {
        return "Facility + " + this.facility + ", Description = " + this.details + ", " +
                "Date accepted = " + this.date + ", Duration = " + this.duration +
                ", Room Number = " + this.room + ", Completed = " + this.completed;
    }
}