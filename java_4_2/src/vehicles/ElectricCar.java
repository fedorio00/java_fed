package vehicles;
public class ElectricCar extends Car {
    private int batteryCapacity;
    public ElectricCar (String model, String license, String color, int year, String ownerName, String insuranceNumber, int batteryCapacity, String engineType){
        super(model, license, color, year, ownerName, insuranceNumber,engineType );
        this.batteryCapacity = batteryCapacity;
    }
    public int getBatteryCapacity(){
        return  batteryCapacity;
    }
    public String vehicleType(){
        return "Vehicle type: Electric car";
    }
    public String engineType(){
        return "Engine type: Electric";
    }

    public String toString(){
        return "Model: "  +  this.model + "| " + "License: " +  this.license + "| " + "Color: " + this.color + "| " + "Year: " + this.year + "| " + "Owner name: "
                + this.getOwnerName() + "| " + "Battery capacity: " + this.getBatteryCapacity();
    }
}


