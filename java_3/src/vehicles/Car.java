package vehicles;
public class Car {
    private String OwnerName;
    private String insuranceNumber;
    protected String engineType;
    public Car(String OwnerName, String insuranceNumber, String engineType) {
        this.OwnerName = OwnerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = engineType;
    }
    public String setOwnerName(){
        return OwnerName;
    }
    public String getOwnerName(){
        return OwnerName;
    }
    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
    public String  getInsuranceNumber(){
        return insuranceNumber;
    }
    public String getEngineType(){
        return engineType;
    }
}

