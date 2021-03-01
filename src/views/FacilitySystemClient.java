package views;

import java.util.HashMap;

import dataAccess.DataReader;
import models.*;

public class FacilitySystemClient {
    public static void main(String[] args) {
        // TODO
        // connect Facility, Use, Maintenance classes to client
        DataReader dr = new DataReader();
        HashMap<String,Object> input = dr.read();
    }
}
