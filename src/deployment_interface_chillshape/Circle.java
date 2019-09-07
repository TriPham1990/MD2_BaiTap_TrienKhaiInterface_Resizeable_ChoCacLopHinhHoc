package deployment_interface_chillshape;

import interface_resizeable.Resizeable;
import shape.Shape;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public void resize(double percent) {
        this.setRadius(this.getRadius() * (percent / 100 + 1));
    }

    @Override
    public String toString() {
        return "A Circle with radius = "
                + this.radius
                + ", which is a subclass of "
                + super.toString();
    }
}