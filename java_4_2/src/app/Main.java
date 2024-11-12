package app;
import vehicles.ElectricCar;
import vehicles.Car;
public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "correct", "black", 2020, "Fedor", "A123AA", "internal combustion");
        ElectricCar electricCar = new ElectricCar("Tesla", "uncorrect", "white", 2023, "Fedor", "A321AA", 100, "" );
        System.out.println(car.toString());
        System.out.println(car.vehicleType());
        System.out.println(" ");
        System.out.println(electricCar.toString());
        System.out.println(electricCar.vehicleType());
        System.out.println(electricCar.engineType());
    }
}



