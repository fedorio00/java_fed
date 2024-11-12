package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car( ownerName: "Райан Гослинг", insuranceNumber: "123456", engineType: "Бензиновый");
        System.out.println(myCar);

        ElectricCar myElectricCar = new ElectricCar( ownerName: "Исаков Федор", insuranceNumber: "654321", engineType: "Электрический", batteryCapacity: "...");
        System.out.println(myElectricCar);
    }
}



