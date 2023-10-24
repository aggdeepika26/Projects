package Opdracht1;
public class Car {
    private String color ;
    private int speed;
    private int hp;
    private int accelationRate;
    private int slowRate;


    public Car()
    {}
    public Car(String color, int speed, int hp)
    {
        this.color = color;
        this.speed = speed;
        this.hp = hp;
    }

    public Car(String color, int speed) {
        this.color = color;
        this.speed = speed;

    }

    public String getColor()
    {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public void accelerate(int amount)
    {
        this.accelationRate = (amount+hp/100);
        System.out.println("Accelation Rate is   :" + this.accelationRate);


    }
    public void slow(int amount)
    {
        this.slowRate = -(amount+hp/100);
        System.out.println("Slow Rate is        :"   + this.slowRate);
    }
    public void park()
    {
        this.speed = 0;
        System.out.println("Park Safely and easily");
    }

    @Override
    public String toString() {

        if(this.getHp() != 0)
        {
            return "Color               :" + getColor() + "\n" +
            "Maximum Speed       :" + getSpeed() + "\n"+
            "Maximum Horse Power :"+ getHp() + "\n";
        }
        else
        {   return "Color               :" + getColor() + "\n" +
                "Maximum Speed       :" + getSpeed() + "\n";

        }

    }



}



