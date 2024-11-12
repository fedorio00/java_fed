package vehicles;

interface ElectricVehicle {
    public int getBatteryCapacity();
    public void setBatteryCapacity(int capacity);

}
public class ElectricCar extends Car implements ElectricVehicle{
    private int batteryCapacity;
    public ElectricCar(String model, String license, String color, int year, String ownerName, int insuranceNumber, String engineType, String vehicleType) {
        super(model, license, color, year, ownerName, insuranceNumber, engineType, vehicleType);
        this.engineType = "Electric";
    }
    public int getBatteryCapacity() {
        return batteryCapacity; // Возвращаем фактическую емкость батареи
    }


    public void setBatteryCapacity(int capacity) {
        this.batteryCapacity = capacity; // Устанавливаем емкость батареи
    }

    public String toString(){
        return "Model: " + this.getModel() + "| " + 
               "License: " + this.getLicense() + "| " + 
               "Year: " + this.getYear() + "| " + 
               "Owner name: " + this.getOwnerName() + "| " + 
               "Insurance number: " + this.getInsuranceNumber() + "| " + 
               "Engine type: " + this.engineType + "| ";
    }
}
