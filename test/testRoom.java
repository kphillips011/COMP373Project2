import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import jdk.jfr.Timestamp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Array;


public class testRoom {

    private Room room;
    private Building building;

    @BeforeEach
    public void setUp() {
        building = new Building(1, "Granada Center", "1032 W. Sheridan Ave, Chicago, IL, 60626", new ArrayList<Room>().add(room))
        room = new Room(building, 35, 311);
    }

    @Test
    @DisplayName("Capacity method should work")
    public void testRequestAvailableCapacity(){
        AssertEquals(35, room.requestAvailableCapacity());
    }

}