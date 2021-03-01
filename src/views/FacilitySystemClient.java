package views;

import java.io.IOException;
import java.util.HashMap;

import dataAccess.DataReader;
import models.*;

public class FacilitySystemClient {
    public static void main(String[] args) throws IOException {
        // TODO
        // connect Facility, Use, Maintenance classes to client
        DataReader dr = new DataReader();
        try{ 
            HashMap<String,Object> input = dr.read();
        }
        catch (IOException e){
            throw new IOException();
        }
    }
}
