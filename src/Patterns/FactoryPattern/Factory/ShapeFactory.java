package Patterns.FactoryPattern.Factory;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        return switch (shapeType) {
            case "circle" -> new Circle();
            case "rectangle" -> new Rectangle();
            default -> null;
        };
    }
}
