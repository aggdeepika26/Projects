package Opdracht1;

public class SUV extends Car{
    private boolean bullbar = true;
    private boolean isAWDOn;
    private int accelationRate;
    public SUV(String color, int speed, int hp,boolean isAWDOn) {
        super(color, speed, hp);                                 //car constructor aanroepen
        this.isAWDOn = isAWDOn;
    }

    public boolean isBullbar() {
        return bullbar;
    }

   /* public void setBullbar(boolean bullbar) {
        this.bullbar = bullbar;

    }*/
    public void allWheelDrive(boolean aWD )
    {
        if(aWD == true)
        {
            super.setSpeed(30);

        }
    }

    @Override
    public void accelerate(int amount)
    {
        if (isAWDOn == true)
        {
            super.setSpeed(30);
            System.out.println("If AWD is on then maximum speed is " + super.getSpeed());
        }


        accelationRate = (amount+super.getHp()/100);
        System.out.println("Acceleration Rate is   :" +this.accelationRate );


    }

    @Override
    public String toString() {

        String genInfo = super.toString();         //aanroepen Car class toString method
        System.out.println(genInfo);
        return "Bull Bar   :" +isBullbar()+ "\n" ;

    }
}


