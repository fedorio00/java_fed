public class Triangle extends GeometricObject implements Colorable {

    private double side1;
    private double side2;
    private double side3;
    private String color;
    private boolean isFilled;



    public Triangle(double side1, double side2, double side3) throws InvalidTriangleException{
        if (!isValidTriangle(side1, side2, side3)) {
            throw new InvalidTriangleException("Стороны не могут образовать треугольник");
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    private boolean isValidTriangle(double side1, double side2, double side3 ){
        return (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2);
    }
    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }

    public boolean getIsFilled(){
        return isFilled;
    }

    public double getArea(){
        double s = (side2 + side2 + side3)/2;
        return Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
    }

    public double getPerimeter(){
        return side1 * side2 * side3;
    }

    public String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return "side1 = " + side1 + " " + "side2 = " + side2 + " " + "side3 = " + side3 + " " + "Filled: " + isFilled + " " + "Color: " + color;
    }
    @Override
    public boolean howToColor(){
        System.out.println("Расскраска не поддерживается");
        return false;
    }
    public class InvalidTriangleException extends Exception{
        public InvalidTriangleException(String message){
            super(message);
        }
    }
}


