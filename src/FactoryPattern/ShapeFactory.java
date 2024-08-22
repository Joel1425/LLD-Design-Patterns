package FactoryPattern;

public class ShapeFactory {
    Shape getShape(String type){
        return switch (type) {
            case "CIRCLE" -> new Circle();
            case "SQUARE" -> new Square();
            default -> null;
        };
    }
}
