package vehicles;


public class Car extends Vehicle{


    public Car(String model, String license, String color, int year, String ownerName, int insuranceNumber, String engineType, String vehicleType) {
        super(model, license, color, year, ownerName, insuranceNumber, engineType);
        this.engineType = "Combustion";
    }
    @Override
    public String vehicleType() {
        return "Car";
    }

    @Override
    public String toString() {
        return "Model: " + this.getModel() + "| " + "License: " + this.getLicense() + "| " + "Year: " + this.getYear() + "| " + "Owner name: " + this.getOwnerName() + "| " + "Insurance number: " + this.getInsuranceNumber() + "| " + "Engine type: " + this.engineType;
    }


}
