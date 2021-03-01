import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import models.Building;
import models.Facility;
import models.Room;
import models.Use;

public class testUse {
    private Use usage;

    @BeforeEach
    public void setUp() {
        usage = new Use(new Facility(1, "facility 1", "address 1"),
                "Faucet Maintenance", new Date(), 100.00, new Room(new Building(2,
                "building 2", "address 2"), 2, 202));
    }

    @Test
    @DisplayName("Testing assignFacilityToUse")
    public void testAssignFacilityToUse(){
        assertEquals(false, usage.isInUseDuringInterval());
        usage.assignFacilityToUse();
        assertEquals(true, usage.isInUseDuringInterval());
    }

    @Test
    @DisplayName("Testing calcUsageRate")
    public void testCalcUsageRate(){
        facility.Use (new Facility(1, "facility 1", "address 1"), "Faucet Maintenance", new Date(),
                100.00, new Room(new Building(2, "building 2", "address 2"), 2, 202));
        assertEquals(8.0, facility.calcMaintenanceCostForFacility());
    }

}