//package models;

import java.util.ArrayList;
import java.util.Date;

public class Use implements UseInterface {
    Facility facility;
    String details;
    Date date; 
    double duration; 
    Room room;
    boolean inUse = false;

    public Use(String details, Date date, double duration, Room room, Facility facility) {
        //super(date, duration, room, facility);
        inUse = true;
        this.details = details;
        this.facility = facility; 
        this.date = date; 
        this.duration = duration; 
        this.room = room;
    }

    @Override
    public boolean isInUseDuringInterval() { return inUse; } //returns if facility is in use

    @Override
    public boolean assignFacilityToUse(Facility facility)
    {
    inUse = true;
    return inUse;
    }

    @Override
    public float calcUsageRate() {
        // calculates the proportion of when a facility is in use to when it is open
        // assumes a facility is open 8 hours a day (9-5)
        double totalDuration = 0;
        ArrayList<Use> uses = this.facility.actualUsage;
        for (Use u: uses){
            totalDuration += u.duration;
        }
        double rate = totalDuration/(8.0*uses.size());
        return (float)rate;
    }

}