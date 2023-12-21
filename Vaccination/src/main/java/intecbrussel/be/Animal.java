package intecbrussel.be;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public abstract class Animal implements Vaccinateable , Treatable {
    private HashMap<Disease,Boolean> isVaccinated ;
    private Boolean isClean;
    private Integer age;
    private String name;
    private Integer animalNumber;
    public Animal()
    {}

    public Animal( Integer animalNumber ,String name, Integer age, Boolean isClean,HashMap<Disease,Boolean> isVaccinated)
    {
        this.animalNumber = animalNumber;
        this.age = age;
        this.name = name;
        this.isClean = isClean;
        this.isVaccinated = isVaccinated;
        vaccinateAnimal(Disease.CHICKENPOCKS);
        vaccinateAnimal(Disease.POLIO);

    }

    @Override
    public void vaccinateAnimal(Disease disease)
    {
        isVaccinated.put(disease,true);
    }

    public HashMap<Disease, Boolean> getIsVaccinated()
    {
        return isVaccinated;
    }

    public void setIsVaccinated(HashMap<Disease, Boolean>  isVaccinated) {
        this.isVaccinated = isVaccinated;

    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAnimalNumber() {
        return animalNumber;
    }

    public void setAnimalNumber(int animalNumber) {
        this.animalNumber = animalNumber;
    }

    public Boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    @Override
    public String toString() {
        return  "AnimalNo.  "+  getAnimalNumber() + " name :" + name + " Age  : " +age +
                " Vaccinations  :" + isVaccinated +
                " isClean :" + isClean ;

    }
}
