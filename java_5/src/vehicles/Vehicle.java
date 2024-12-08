package vehicles;
public abstract class Vehicle {
    private String model;
    private String license;
    private String color;
    private int year;
    private String ownerName;
    private int insuranceNumber;
    String engineType;
    public String vehicleType;
    Vehicle(String model, String license, String color, int year, String ownerName, int insuranceNumber, String engineType){
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = engineType;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setLicense(String license){
        this.license = license;
    }
    public String getLicense(){
        return license;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public void setInsuranceNumber(int insuranceNumber){
        this.insuranceNumber = insuranceNumber;
    }
    public int getInsuranceNumber(){
        return insuranceNumber;
    }
    public void setEngineType(String engineType){
        this.engineType = engineType;
    }
    public String getEngineType(){
        return engineType;
    }
    public String toString(){
        return "Model: " + this.model + "| " + "License: " + this.license + "| " + "Year: " + this.year + "| " + "Owner name: " + this.ownerName + "| " + "Insurance number: " + this.insuranceNumber + "| " + "Engine type: " + this.engineType;
    }
    public abstract String vehicleType();
}