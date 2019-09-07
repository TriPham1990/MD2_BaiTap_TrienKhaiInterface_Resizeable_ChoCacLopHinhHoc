package deployment_interface_chillshape;

import interface_resizeable.Resizeable;
import shape.Shape;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }


    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    @Override
    public void resize(double percent) {
        this.setWidth(this.getWidth() * (percent / 100 + 1));
        this.setLength(this.getLength() * (percent /100 + 1));
    }

    @Override
    public String toString() {
        return "A Rectangle with width ="
                + this.width
                + " and length ="
                + this.length
                + ", which is a subclass of "
                + super.toString();
    }
}
