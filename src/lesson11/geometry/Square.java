package src.lesson11.geometry;

public class Square implements Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }
}