package dataAccess;

import java.util.Date;
import java.io.*;
import java.util.HashMap;

import models.*;

public class DataReader {

    public HashMap<String,Object> read(String[] args) throws IOException {
        HashMap<String,Object> output = new HashMap<String,Object>();
        FacilityManager fm = new FacilityManager();
        BufferedReader csvRead;
        try {
            csvRead = new BufferedReader( new FileReader(new File("dataFile.csv")));
            String nextLine;
            while ( (nextLine = csvRead.readLine()) != null ){
                String[] data = csvRead.readLine().split(",");
                String[] params;
                Date date;
                String[] datestr;
                Facility facility = new Facility(0, "Facility 0", "Default details");
                Building building = new Building(0, "Building 0", "0000 Default Street");
                Room room = new Room(building, 0, 0);
                MaintenanceRequest mr;
                Use use;
                switch(data[0]){
                    case "Facility":
                        //Create Facility
                        params = csvRead.readLine().split(",");
                        facility = new Facility(Integer.valueOf(params[0]), params[1], params[2]);
                        fm.addNewFacility(facility);
                        output.put("Facility", facility);
                        if(csvRead.readLine().split(",")[0].equals("")){
                            break;
                        }
                    case "Building":
                        //Create Building
                        params = csvRead.readLine().split(",");
                        building = new Building(Integer.valueOf(params[0]), params[1], params[2]);
                        facility.addBuilding(building);
                        output.put("Building", building);
                        if(csvRead.readLine().split(",")[0].equals("")){
                            break;
                        }
                    case "Room":
                        //Create Room
                        params = csvRead.readLine().split(",");
                        room = new Room(building, Integer.valueOf(params[2]), Integer.valueOf(params[1]));
                        building.addRoom(room);
                        output.put("Room", room);
                        if(csvRead.readLine().split(",")[0].equals("")){
                            break;
                        }
                    case "Maintenance":
                        //Create Maintenance
                        params = csvRead.readLine().split(",");
                        datestr = params[2].split("-");
                        date = new Date(Integer.valueOf(datestr[2]), Integer.valueOf(datestr[1]), Integer.valueOf(datestr[0]));
                        mr = new MaintenanceRequest(facility, params[0], Integer.valueOf(params[1]), date, Integer.valueOf(params[3]), room);
                        facility.makeFacilityMaintRequest(mr.getDetails(), mr.getMaintenanceCost(), mr.getDate(), mr.getDuration(), mr.getRoom());
                        output.put("MaintenanceRequest", mr);
                        if(csvRead.readLine().split(",")[0].equals("")){
                            break;
                        }
                    case "Use":
                        //Create Use
                        params = csvRead.readLine().split(",");
                        datestr = params[2].split("-");
                        date = new Date(Integer.valueOf(datestr[2]), Integer.valueOf(datestr[1]), Integer.valueOf(datestr[0]));
                        use = new Use(params[0], date, Integer.valueOf(params[1]), room, facility);
                        facility.addUse(use);
                        output.put("Use", use);
                        if(csvRead.readLine().split(",")[0].equals("")){
                            break;
                        }
                    }
                }
                csvRead.close();
                output.put("FacilityManager", fm);
        }
        finally{
            return output;
        }
    }
}