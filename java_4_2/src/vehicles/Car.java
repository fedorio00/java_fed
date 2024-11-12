package vehicles;
public class Car extends Vehicle {
    public Car(String model, String license, String color, int year, String ownerName, String insuranceNumber,String engineType) {
        super(model, license, color, year, ownerName, insuranceNumber);
    }
    public String vehicleType() {
        return "Car";
    }
    @Override
    public String toString(){
        return "Model:" + this.model + "| " + "License: " + this.license + "| " + "Color: " + this.color + "| " + "Year: " + this.year + "| "
                + "Owner name: " + this.getOwnerName() + "| " + "Insurance number: " + getInsuranceNumber();
    }
}


