package day9.Task2;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double perimeter() {
        return sideA + sideB + sideC;
    }

    public double area() {
        double halfMeter = perimeter() / 2;
        return Math.sqrt(halfMeter * (halfMeter - sideA) * (halfMeter - sideB) * (halfMeter - sideC));
    }
}
