package app;

import vehicles.ElectricCar;
import vehicles.Car;


public class Main {
    public static void main(String[] args) {
        Car car = new Car("Fedor Isakov", "ikbo-6223", "Бензин");
        System.out.println("Владелец: " + car.getOwnerName());
        System.out.println("Страховой номер: " + car.getInsuranceNumber());
        System.out.println("Тип двигателя: " + car.getEngineType());
        System.out.println("-------------------------------");
        ElectricCar electricCar = new ElectricCar("Fedor Isakov", "ikbo-6223", "Electric", 50);
        System.out.println("Владелец: " + electricCar.getOwnerName());
        System.out.println("Страховой номер: " + electricCar.getInsuranceNumber());
        System.out.println("Тип двигателя: " + electricCar.getEngineType());
        System.out.println("Ёмкость батареи: " + electricCar.getBatteryCapacity());


    }
}