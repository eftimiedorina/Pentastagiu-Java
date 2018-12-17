package Exercice1;

public class Square extends Shape {
    private double length;
    //private double width;

    public Square(double lenght) {
        this.length = lenght;

    }

    @Override
    public double area() {
        return length*length;
    }

    @Override
    public double perimeter() {
        return 4*length;
    }
}
