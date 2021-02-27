package dataaccess;

import java.util.ArrayList;
import java.util.Date;
import java.io.*;
import models.*;

public class DataReader {


    public HashMap<String,Object> read(String[] args){
        HashMap<String,Object> output;
        BufferedReader csvRead;
        try {
            csvRead = new BufferedReader( new FileReader(new File("dataFile.csv")));
        }
        catch (Exception e) {
            throw new Exception("Could not find file");
        }
        String nextLine;
        while ( (nextLine = csvRead.readLine()) != null ){
            String[] data = csvRead.readLine().split(",");
            String[] params;
            Date date;
            String[] datestr;
            switch(data[0]){
                case "Facility":
                    //Create Facility
                    params = csvRead.readLine().split(",");
                    Facility facility = new Facility(Integer.valueOf(params[0]), params[1], params[2]);
                    output.put("Facility", facility)
                    if(csvRead.readLine().split(",")[0].equals("")){
                        break;
                    }
                case "Building":
                    //Create Building
                    params = csvRead.readLine().split(",");
                    Building building = new Building(Integer.valueOf(params[0]), params[1], params[2]);
                    facility.buildings.add(building);
                    output.put("Building", building)
                    if(csvRead.readLine().split(",")[0].equals("")){
                        break;
                    }
                case "Room":
                    //Create Room
                    params = csvRead.readLine().split(",");
                    Room room = new Room(params[0], Integer.valueOf(params[2]), Integer.valueOf(params[1]));
                    building.rooms.add(room);
                    output.put("Room", room)
                    if(csvRead.readLine().split(",")[0].equals("")){
                        break;
                    }
                case "Maintenance":
                    //Create Maintenance
                    params = csvRead.readLine().split(",");
                    datestr = params[2].split("-");
                    date = new Date(Integer.valueOf(datestr[2]), Integer.valueOf(datestr[1]), Integer.valueOf(datestr[0]));
                    MaintenanceRequest mr = new MaintenanceRequest(facility, params[0], Integer.valueOf(params[1]), date, Integer.valueOf(params[3]), room);
                    facility.requestedMaintenance.add(mr);
                    output.put("MaintenanceRequest", mr)
                    if(csvRead.readLine().split(",")[0].equals("")){
                        break;
                    }
                case "Use":
                    //Create Use
                    params = csvRead.readLine().split(",");
                    datestr = params[2].split("-");
                    date = new Date(Integer.valueOf(datestr[2]), Integer.valueOf(datestr[1]), Integer.valueOf(datestr[0]));
                    Use use = new Use(params[0], date, params[1], room, facility);
                    facility.actualUse.add(mr);
                    output.put("Use", use);
                    if(csvRead.readLine().split(",")[0].equals("")){
                        break;
                    }
            }
        }
        return output;
    }
}