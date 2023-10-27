package Opdracht1_Robot;

public class LiftingRobot extends Robot{

    // data members
    private double  maxLiftHeight;
    private double height;

    // 1 parameterized constructor
    public LiftingRobot(double maxLiftHeight, String unitName)
    {
        super(unitName);                                           // super constructor call with parameter unitName
        this.maxLiftHeight = maxLiftHeight;

    }

    // 1 method
    public void lift(double height)
    {
        this.height = Math.abs(height);
        if(height > maxLiftHeight)
        {
            System.out.println("sorry the lifting is not possible with the requested height");

        }
        else
        {
            System.out.println("The lifting  is successful with the requested height " + Math.abs(height) );
        }
    }


}
