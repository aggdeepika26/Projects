package Opdracht1;

public class Cabrio extends Car{
    private  boolean sunroof = true  ;
    //Constructor
    public Cabrio(String color, int speed, int hp)
    {
        super(color,speed,hp);                              //Super class Car constructor aanroepen
    }
    // Method
    public boolean isSunroof()
    {
        return sunroof;
    }
    public void openRoof()
    {
        System.out.println("Adjustable roof      :   Yes");
    }

    @Override
    public String toString()
    {
        String genInfo = super.toString();         //aanroepen Car class toString method
        System.out.println(genInfo);
        return "Sun Roof   :" +isSunroof()+ "\n" ;

    }




}
