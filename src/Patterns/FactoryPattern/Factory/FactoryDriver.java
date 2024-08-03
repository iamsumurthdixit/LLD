package Patterns.FactoryPattern.Factory;

public class FactoryDriver {
    public static void driver() {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("circle");
        circle.draw(); // Inside Circle

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw(); // Inside Rectangle
    }
}
