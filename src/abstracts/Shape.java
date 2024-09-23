package abstracts;

public abstract class Shape implements Cloneable {
    public int x;
    public int y;
    public String color;

    public Shape() {

    }

    public abstract Shape clone();

    public Shape(Shape source) {
        if (source != null) {
            this.x = source.x;
            this.y = source.y;
            this.color = source.color;
        }
    }

    @Override
    public String toString() {
        return "shape: x=" + x + ", y=" + y + ", color=" + color;
    }
}
