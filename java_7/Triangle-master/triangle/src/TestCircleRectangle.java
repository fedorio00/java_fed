import java.util.ArrayList;

public class TestCircleRectangle {
    public static void main(String[] args) throws Triangle.InvalidTriangleException {
//        Circle circle = new Circle(1);
//        System.out.println("Круг " + circle.toString());
//        System.out.println("Радиус равен " + circle.getRadius());
//        System.out.println("Площадь равна " + circle.getArea());
//        System.out.println("Диаметр равен " + circle.getDiameter());
//
//        Rectangle rectangle = new Rectangle(2, 4);
//        System.out.println("\nПрямоугольник " + rectangle.toString());
//        System.out.println("Площадь равна " + rectangle.getArea());
//        System.out.println("Периметр равен " + rectangle.getPerimeter() + "\n");
//
//        ArrayList<GeometricObject> objects = new ArrayList<>();
//
//        // Добавляем объекты разных типов
//
//        objects.add(new Square(4));
//        objects.add(new Circle(5));
//        objects.add(new Square(3));
//        objects.add(new Rectangle(3,3,"Gray", false));
//
//        // Выводим информацию о каждом объекте
//        for (GeometricObject object : objects) {
//            System.out.println("Площадь: " + object.getArea());
//            if (object instanceof Colorable) {
//                ((Colorable) object).howToColor();
//            }
//        }

        GeometricObject obj1 = new Triangle(2, 2,2) {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };
        GeometricObject obj2 = new Triangle(3,3,3) {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };

        GeometricObject maxObj = GeometricObject.max(obj1, obj2);
        System.out.println("Наибольший объект: " + maxObj);
    }
}