package intecbrussel.be;

import java.util.HashMap;

public class Monkey extends Animal {
    private boolean isHyperActive;
    public Monkey()
    {}
    public Monkey(Integer animalNumber, String name, Integer age, Boolean isClean, HashMap<Disease,Boolean> isVaccinated)
    {
        super(animalNumber, name,age,isClean,isVaccinated);

    }

    @Override
    public void treatAnimal()
    {
        isHyperActive = false;
        System.out.println("Monkey is cleaned and problem of hyper activity is solved and set to  "+isHyperActive );
    }
}
