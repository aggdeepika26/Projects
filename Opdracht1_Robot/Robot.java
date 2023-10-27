package Opdracht1_Robot;

abstract class Robot

{   // 2 constructors , 1 no argument constructor, 1 parameterized constructor
    private String unitName;
    public Robot()
    {
        unitName = "Nameless Robot";

    }
    public Robot(String unitName)
    {
       boot();                                         // boot method of this class called at the construction time
       this.unitName = unitName;
       System.out.println("My Name is " + this.unitName);

    }

    public void boot()
    {
        System.out.println("Robot is starting up.............");

    }

  /*  @Override
    public String toString() {
        return
                "My Name is" + this.unitName ;

    }*/
}
