package vehicles;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String ownerName, String insuranceNumber, String engineType, int batteryCapacity) {
        super(ownerName, insuranceNumber, engineType);
        this.batteryCapacity = batteryCapacity;
    }


    public int getBatteryCapacity() {
        return batteryCapacity;
    }
}


