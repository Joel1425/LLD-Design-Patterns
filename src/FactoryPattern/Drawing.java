package FactoryPattern;

public class Drawing {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }
}
