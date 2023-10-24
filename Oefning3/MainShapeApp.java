package Oefning3;

public class MainShapeApp {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();             //Parent Class constructor
        String msg = shapes.toString();           //Message from Parent class
        System.out.println(msg);
        Rectangle rectangle = new Rectangle(20,40); //rectangle object invoke parameterized constructor
        String rectangleInfo = rectangle.toString();
        System.out.println(rectangleInfo);

        Square square = new Square(5);               //Square object invoke single parameterized constructor
        String squareInfo = square.toString();
        System.out.println(squareInfo);

        Circle circle = new Circle(2, 3.14f);         //circle object invoke parameterized constructor
        String circleInfo = circle.toString();
        System.out.println(circleInfo);





    }
}
