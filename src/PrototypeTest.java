import model.Circle;
import model.Rectangle;
import model.Triangle;

public class PrototypeTest {
    public static void main(String[] args) {
        System.out.println("\nRetângulo\n");
        Rectangle rect1 = new Rectangle();
        rect1.x = 5;
        rect1.y = 10;
        rect1.width = 5;
        rect1.height = 5;
        rect1.color = "Pink";

        Rectangle rectClone = (Rectangle) rect1.clone();
        System.out.println("Original Rectangle: " + rect1);
        System.out.println("Cloned Rectangle: " + rectClone);

        System.out.println("\nCírculo\n");
        Circle circle1 = new Circle();
        circle1.x = 4;
        circle1.y = 6;
        circle1.radius = 20;
        circle1.color = "Blue";

        Circle circleClone = (Circle) circle1.clone();
        System.out.println("Circle: " + circle1);
        System.out.println("Cloned Circle: " + circleClone);

        System.out.println("\nTriângulo:\n");
        Triangle triangle1 = new Triangle();
        triangle1.x = 0;
        triangle1.y = 0;
        triangle1.base = 8;
        triangle1.height = 12;
        triangle1.color = "Green";

        Triangle triangleClone = (Triangle) triangle1.clone();
        System.out.println("Original Triangle: " + triangle1);
        System.out.println("Cloned Triangle: " + triangleClone);
    }
}
