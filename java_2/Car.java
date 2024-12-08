public class Car {
    private String model; // 6 usages
    private String license; // 6 usages
    private String color; // 6 usages
    private int year; // 6 usages

    public Car(String model, String license, String color, int year) { // 1 usage
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    public Car() { // 1 usage
        this.model = "Неизвестно";
        this.license = "Неизвестно";
        this.color = "Неизвестно";
        this.year = 0;
    }

    public Car(String model, String license) { // 1 usage
        this.model = model;
        this.license = license;
        this.color = "Неизвестно";
        this.year = 0;
    }

    public void setModel(String model) { // no usages
        this.model = model;
    }

    public void setLicense(String license) { // no usages
        this.license = license;
    }

    public void setColor(String color) { // no usages
        this.color = color;
    }

    public void setYear(int year) { // no usages
        this.year = year;
    }

    public String getModel() { // no usages
        return model;
    }

    public String getLicense() { // no usages
        return license;
    }

    public String getColor() { // no usages
        return color;
    }

    public int getYear() { // no usages
        return year;
    }

    public String toString() {
        return "Модель: " + model + ", Лицензия: " + license +
               ", Цвет: " + color + ", Год выпуска: " + year + "\n";
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota Crown", "134-VL6", "Белый", 2024);
        Car car2 = new Car();
        Car car3 = new Car("BMW M5 F90", "666-STR");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        car3.setYear(2000);
        System.out.println("после изменения: ");
        System.out.println(car3);
    }
}