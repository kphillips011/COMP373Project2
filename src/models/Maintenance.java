import java.rmi.server.RemoteServer;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

import sun.applet.Main;

public class Maintenance implements MaintenanceInterface {
    String details;
    boolean completed;
    float cost;
    Facility facility;
    LocalTime duration;
    Room room;
    Date date;

    // default constructor
    public Maintenance() {
        this.details = "No details available";
        this.completed = false;
        this.cost = 0;
        this.facility = new Facility();
        this.duration = new LocalTime("0:00:00"); // TODO fix
        this.room = new Room(new Building(), 0,000);
        this.date = new Date();
    }

    public Maintenance(Facility facility, String details, int cost, Date date, LocalTime dur, Room room) {
        this.facility = facility; this.details = details; this.duration = duration; this.room = room; this.date = date;
        this.cost = (duration.getHour() + duration.getMinute()/60) * 15;
        this.completed = false;
    }

    public float getMaintenanceCost() { return this.cost; }

    public boolean isCompleted() { return this.completed; }

    public String toString() {
        return "Facility + " + this.facility + ", Description = " + this.details + ", " +
                "Date accepted = " + this.date + ", Duration = " + this.duration +
                ", Room Number = " + this.room + ", Completed = " + this.completed;
    }

    public Maintenance listMaintenance() { return this; }
}