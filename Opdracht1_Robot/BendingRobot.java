package Opdracht1_Robot;

public class BendingRobot extends Robot

{
    // data members
    private double maxBendAngle;
    private double angle;
    // 1 parameterized constructor
    public BendingRobot(double maxBendAngle, String unitName)
    {
        super(unitName);                                                     // super constructor call with parameter unitName
        this.maxBendAngle = maxBendAngle;

    }

    // 1 method

    public void bend(double angle)
    {
        this.angle = Math.abs(angle);
        if(angle > maxBendAngle)
        {
            System.out.println("sorry the bending is not possible");

        }
        else
        {
            System.out.println("The bending is successful with the requested angle " + angle);
        }
    }


}
