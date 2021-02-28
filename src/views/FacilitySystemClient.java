package views;

import java.util.HashMap;

import models.*;
import dataaccess.DataReader;

public class FacilitySystemClient {
    public static void main(String[] args) {
        // TODO
        // connect Facility, Use, Maintenance classes to client
        DataReader dr = new DataReader();
        HashMap<String,Object> input = dr.read();
    }
}
