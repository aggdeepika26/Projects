//Schijf een programma over vormen.
//
//Maak gebruik van inheritance en polymorphism.
//
//Er moeten minimaal 3 verschillende vormen zijn.
//
//Van deze vormen ga je de omtrek en oppervlakte berekenen

package Oefning3;

public class Shapes
{

        private int lengthOfRectangle;
        private int breadthOfRectangle;
        private int radius;
        private int sideOfSquare;
        private float pi ;
        //Constructors Declared
        Shapes()
        {}
        public Shapes(int length, int breadth)   //Rectangle constructor declared
        {
            this.lengthOfRectangle = length;
            this.breadthOfRectangle = breadth;
        }
        public Shapes( int sideOfSquare)    //Square Constructor declared
        {
            this.sideOfSquare = sideOfSquare;
        }
        public Shapes(int radius, float pi )  // Circle constructor declared
        {
            this.radius = radius;
            this.pi = pi;
        }

        //Getter and Setter Method
        public int getLengthOfRectangle()
        {
        return lengthOfRectangle;
        }

        public void setLengthOfRectangle(int lengthOfRectangle)
        {
        this.lengthOfRectangle = lengthOfRectangle;
        }

        public int getBreadthOfRectangle()
        {
        return breadthOfRectangle;
        }

        public void setBreadthOfRectangle(int breadthOfRectangle)
        {
        this.breadthOfRectangle = breadthOfRectangle;
        }

        public int getRadius()
        {
        return radius;
        }

        public void setRadius(int radius) {
        this.radius = radius;
         }

        public float getPi() {
        return pi;
        }

        public int getSideOfSquare()
        {
        return sideOfSquare;
        }

        public void setSideOfSquare(int sideOfSquare)
        {
        this.sideOfSquare = sideOfSquare;
        }
        //Area and Perimeter Method
        public float area()
        {
            return this.lengthOfRectangle * this.breadthOfRectangle;
        }
        public float perimeter()
        {
            return 2*(this.lengthOfRectangle + this.breadthOfRectangle);
        }
        public String toString()
        {
            return "Welcome to Math World \n";
        }

}
