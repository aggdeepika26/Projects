package Opdracht1_Robot;

public class MainRobotApp {
    public static void main(String[] args) {
        BendingRobot bendingRobot = new BendingRobot(360,"Bending Robot"); // Bending robot object
        bendingRobot.bend(200);
        System.out.println();

        LiftingRobot liftingRobot = new LiftingRobot(50, "Lifting Robot"); // Lifting Robot object
        liftingRobot.lift(40);
        System.out.println();

        CrazyRobot crazyRobot = new CrazyRobot();                       // Crazy Robot object




    }
}
