package Oefning3;

public class Rectangle extends Shapes
{
    public Rectangle(int length,int breadth)
    {
        super(length,breadth);         // invoke constructor in Shapes class
    }

    @Override
    public String toString()
    {
        return "length Of Rectangle     = " +  super.getLengthOfRectangle() + "\n"+
                "Breadth Of Rectangle    = " + super.getBreadthOfRectangle() + "\n"+
                "Area of Rectangle       = " + super.area()+"\n" +
                "Perimeter Of Rectangle  = " + super.perimeter() + "\n";



    }
}
