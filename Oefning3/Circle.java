package Oefning3;

public class Circle extends Shapes {
    public Circle(int radius, float pi)
    {
        super(radius, pi);                              // invoke constructor in Shapes class
    }

    @Override
    public float area() {
        return getPi() * getRadius() * getRadius();
    }

    @Override
    public float perimeter() {
        return 2 * getPi() * getRadius();
    }

    @Override
    public String toString() {
        return "radius of circle is      = " + super.getRadius() + "\n" +
                "Area of Circle          = " + area() + "\n" +
                "Perimeter Of Rectangle  = " + perimeter();

    }
}
