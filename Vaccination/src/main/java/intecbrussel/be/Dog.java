package intecbrussel.be;

import java.util.HashMap;

public class Dog extends Animal {
    private HashMap<Disease,Boolean> isVaccinated ;
    private boolean hasFoulBreath;
   // Boolean isClean;
    public Dog()
    {}

    public Dog( int animalNumber ,String name, int age, boolean isClean, HashMap<Disease,Boolean> isVaccinated)
    {
        super(animalNumber,name,age,isClean,isVaccinated);
        //this.isClean = isClean;



    }
    @Override
    public void treatAnimal() {

        hasFoulBreath = false;
        System.out.println("Dog is cleaned and problem of foul breath is solved and hasFoulBreath set to "+ hasFoulBreath );
    }
}
