public class Square extends GeometricObject implements Colorable {
    private double side;
    private String color;

    public Square() {
        this(0);
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }



    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square with side: " + side + " and color: " + color;
    }

    @Override
    public boolean howToColor() {
        System.out.println("Раскрасьте все четыре стороны.");

        return false;
    }
}
