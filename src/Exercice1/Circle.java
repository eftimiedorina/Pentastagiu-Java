package Exercice1;

public class Circle extends Shape {
    private double radius;
    private double pi = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi*Math.exp(radius);
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }
}
