package Oefning3;

public class Square extends Shapes{
    public Square(int sideOfSquare)
    {
        super(sideOfSquare) ;                           // invoke constructor in Shapes class
    }
    @Override
    public float area() {
        return getSideOfSquare()*getSideOfSquare();
    }

    @Override
    public float perimeter() {
        return 4*getSideOfSquare();
    }



    @Override
    public String toString()
    {
        return " Side of the Square is  :" + getSideOfSquare() + "\n" +
                "Area of the Square is  :" + area() + "\n" +
                "Perimeter of the Square is  :" + perimeter() + "\n" ;
    }



}
