package Opdracht1_Robot;

public class CrazyRobot extends Robot{

    // data members
    String unitName;

    // 1 no arg constructor
    public CrazyRobot()
    {
        this.unitName = "Crazy Robot";
        boot();

    }

    @Override
    public void boot() {
        super.boot();
        System.out.println("I am " + unitName);

        System.out.println("I can bend");
        char myCharArray[] = unitName.toCharArray();     // String to  character array
        int length = myCharArray.length;
        System.out.println();
        System.out.println("I can reverse my name");
        for(int i = length-1 ; i>=0; i--)               // loop to reverse the name of robot
        {
            System.out.print(myCharArray[i] + " ");

        }




    }
}
