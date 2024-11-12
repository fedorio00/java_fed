package app;

import vehicles.ElectricCar;
import vehicles.Car;


public class Main {
    public static void main(String[] args) {
    Car car = new Car("BMW","correct", "black", 2020, "Fedor", 1234, " ", " ");
    ElectricCar electricCar = new ElectricCar("Tesla", "uncorrect", "blue", 2023, "Andrew",1000 , " ", " ");
    System.out.println(car.toString());
    System.out.println("Engine type: " + car.getEngineType());
    System.out.println("Vehicle type: " + car.vehicleType());
    car.setYear(2000);
    car.setOwnerName("Mike");
    car.setInsuranceNumber(1111);
    System.out.println("Modified year: " + car.getYear());
    System.out.println("Modified owner name: " + car.getOwnerName());
    System.out.println("________________________");
    System.out.println(electricCar.toString());
    System.out.println("Engine type: " + electricCar.getEngineType());
    electricCar.setBatteryCapacity(100);
    System.out.println("Battery Capacity: " + electricCar.getBatteryCapacity());
    }
}