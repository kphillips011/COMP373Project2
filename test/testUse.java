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
    public void assignFacilityToUse(){
        assertEquals(false, usage.isInUseDuringInterval());
        usage.assignFacilityToUse();
        assertEquals(true, usage.isInUseDuringInterval());
    }

    @Test
    @DisplayName("Testing calcUsageRate")
    public void calcUsageRate(){
        facility.Use (new Facility(1, "facility 1", "address 1"), "Faucet Maintenance", new Date(),
                100.00, new Room(new Building(2, "building 2", "address 2"), 2, 202));
        assertEquals(8.0, facility.calcMaintenanceCostForFacility());
    }

}