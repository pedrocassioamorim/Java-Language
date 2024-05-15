package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;
import model.enums.Color;

public class Main {
    public static void main(String[] args) {
        AbstractShape s1 = new Circle(Color.BLACK, 5);
        AbstractShape s2 = new Rectangle(Color.WHITE, 4, 6);

        System.out.println("Circle Color: " + s1.getColor());
        System.out.println("Circle area: " + String.format("%.3f", s1.area()));
        System.out.println("Rectangle Color: " + s2.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));

    }
}