package model;

import abstracts.Shape;

public class Circle extends Shape {
    public int radius;

    public Circle()
    {

    }

    public Circle(Circle source) {
        super(source);
        if (source != null) {
            this.radius = source.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "circle: radius=" + radius + ", " + super.toString();
    }
}
