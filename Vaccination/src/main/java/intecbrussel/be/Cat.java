package intecbrussel.be;

import java.util.HashMap;

public class Cat extends Animal{
    private boolean hasLongNails;
    //Boolean isClean ;

    public Cat()
    {}

    public Cat(Integer animalNumber,String name, Integer age, Boolean isClean, HashMap<Disease,Boolean> isVaccinated)
    {
        super(animalNumber,name,age,isClean,isVaccinated);
       // this.isClean = isClean;

    }

    @Override
    public void treatAnimal() {

        hasLongNails = false;
        System.out.println("Cat is cleaned and problem of long Nails is solved. Long Nails set to "+hasLongNails );

    }

}
