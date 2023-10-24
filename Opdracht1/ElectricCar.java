package Opdracht1;

public class ElectricCar extends Car{
    private int battery ;
    private int accelationRate;
    private int slowRate;
   /* public ElectricCar()
    {}
    public ElectricCar(int battery)
    {
        this.battery = battery;
       // System.out.println(battery);

    }

    public int getBattery() {
        return this.battery;
    }*/

    public ElectricCar(String color, int speed, int battery)
    {
        super(color,speed);             //car constructor aanroepen
        this.battery = battery;
    }

    @Override
    public void accelerate(int amount)
    {
        this.accelationRate = (amount+battery/100);
        System.out.println("Accelation Rate is   :" + this.accelationRate);

    }

    @Override
    public void slow(int amount) {
        this.slowRate = -(amount+battery/100);
        System.out.println("Slow rate of the car is  "  +this.slowRate);
    }

    @Override
    public void park() {
        System.out.println("Car is parked for charging");
        this.charge(100);
    }
    public void charge(int amount)
    {
        System.out.println("100% charged");
    }
    public String toString()
    {
        String genInfo = super.toString();         //aanroepen Car class toString method
        System.out.println(genInfo);
        return "Currently Battery  is            :" + this.battery + "\n";

    }

}
