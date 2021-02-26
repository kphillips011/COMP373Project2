import java.rmi.server.RemoteServer;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

import sun.applet.Main;

public class Maintenance implements MaintenanceInterface {
    Facility facility;
    String details;
    double cost;
    LocalTime duration;
    Room room;
    Date date;
    boolean completed;

    // default constructor
    public Maintenance() {
        this.details = "No details available";
        this.completed = false;
        this.cost = 0.00;
        this.facility = new Facility();
        this.duration = null; // TODO fix
        this.room = new Room(new Building(), 0,000);
        this.date = new Date();
    }

    public Maintenance(Facility facility, String details, double cost, Date date, LocalTime dur, Room room) {
        this.facility = facility; this.details = details; this.duration = duration; this.room = room; this.date = date;
        this.cost = (duration.getHour() + duration.getMinute()/60) * 15;
        this.completed = false;
    }

    @Override
    public double getMaintenanceCost() { return this.cost; }

    @Override
    public boolean isCompleted() { return this.completed; }

    @Override
    public String toString() {
        return "Facility + " + this.facility + ", Description = " + this.details + ", " +
                "Date accepted = " + this.date + ", Duration = " + this.duration +
                ", Room Number = " + this.room + ", Completed = " + this.completed;
    }

    @Override
    public Maintenance listMaintenance() { return this; }

    // make Inspection into inner class
    public class Inspection {
        boolean passed;

        public Inspection() { this.passed = true; }

        public void passInspection() { this.passed = true; }

        public void failInspection() { this.passed = false;}

        public boolean passed() { return this.passed; }
    }
}