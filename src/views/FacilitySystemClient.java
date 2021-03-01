package views;

import java.io.IOException;
import java.util.*;

import dataAccess.DataReader;
import models.*;

public class FacilitySystemClient {
    public static void main(String[] args) throws IOException {
        // TODO
        // connect Facility, Use, Maintenance classes to client
        DataReader dr = new DataReader();
        HashMap<String,Object> input;
        try{ 
            input = dr.read();
        }
        catch (IOException e){
            throw new IOException();
        }
        Iterator i = input.entrySet().iterator();
        while(i.hasNext()){
            Map.Entry element = (Map.Entry)i.next();
            String key = element.getKey().toString();
            Object val = element.getValue();
            switch(key){
                case "Facility":
                    break;
                case "Building":
                    break;
                case "Room":
                    break;
                case "MaintenanceRequest":
                    break;
                case "Use":
                    break;
            }
        }
    }
}
