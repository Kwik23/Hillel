package src.lesson11.geometry;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Circle(5);
        figures[1] = new Triangle(4, 3);
        figures[2] = new Square(6);

        double totalArea = 0;
        DecimalFormat df = new DecimalFormat("#.##");

        for (Figure figure : figures) {
            double area = figure.calculateArea();
            totalArea += area;
            System.out.println(figure.getClass().getSimpleName() + " area: " + df.format(area));
        }

        System.out.println("Total area: " + df.format(totalArea));
    }
}

