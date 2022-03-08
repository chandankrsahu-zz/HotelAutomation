public enum Appliance {
    AC(10),
    LIGHT(5);


    private final int unitConsumption;

    Appliance(int unitConsumption) {
        this.unitConsumption = unitConsumption;
    }

    public int getUnitConsumption() {
        return unitConsumption;
    }
}
