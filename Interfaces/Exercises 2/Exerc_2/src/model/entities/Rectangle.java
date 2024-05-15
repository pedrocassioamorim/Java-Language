package model.entities;

import model.enums.Color;

public class Rectangle extends AbstractShape {
    private double width;
    private double height;

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.height = height;
        this.width = width;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return height * width;
    }
}
