package intecbrussel.be;

import java.util.*;
import java.util.stream.Collectors;

public class AnimalShelter {
    private HashMap<Disease, Boolean> isVaccinated;
    private List<Animal> animals;
    private int animalId;
    Dog dog = new Dog();
    Cat cat = new Cat();
    Monkey monkey = new Monkey();

    public AnimalShelter() {
    }

    public AnimalShelter(List<Animal> animals, HashMap<Disease, Boolean> isVaccinated) //Constructor to pass animal list and hashmap for disease in which all disease vaccine made to false
    {
        this.animals = animals;
        this.isVaccinated = isVaccinated;
    }

    //Methode 1
    public void printAnimals() {
        animals.stream().forEach(System.out::println);
    }

    //Methode 2
    public void sortAnimals() {
        List<Animal> sortedAnimalNoList = (animals.stream().sorted((i1, i2) -> i1.getAnimalNumber().compareTo(i2.getAnimalNumber())).collect(Collectors.toList()));
        System.out.println("Sorted List of animals by their animal no.\n");
        sortedAnimalNoList.stream().forEach(System.out::println);
    }

    //Methode 3
    public void sortAnimalsByName() {
        List<Animal> sortedAnimalByNameList = (animals.stream().sorted((i1, i2) -> i1.getName().compareTo(i2.getName())).collect(Collectors.toList()));
        System.out.println("Sorted List of animals by their name.\n");
        sortedAnimalByNameList.stream().forEach(System.out::println);
    }

    //Methode 4

    public void sortAnimalsByAge() {
        List<Animal> sortedAnimalByAgeList = (animals.stream().sorted((i1, i2) -> i1.getAge().compareTo(i2.getAge())).collect(Collectors.toList()));
        System.out.println("Sorted List of animals by their age.\n");
        sortedAnimalByAgeList.stream().forEach(System.out::println);
    }

    //Methode 5
    public void printAnimalsNotVaccinated(Disease disease)
    {
        if (isVaccinated.get(Disease.CHICKENPOCKS).equals(false)) {
            System.out.println("ChickenPox vaccine not given.\n");
            animals.stream().forEach(System.out::println);
        }
        if (isVaccinated.get(Disease.POLIO).equals(false)) {
            System.out.println("Polio vaccine not given.\n");
            animals.stream().forEach(System.out::println);
        }
        if (isVaccinated.get(Disease.FLUE).equals(false)) {
            System.out.println("Flue vaccine not given.\n");
            animals.stream().forEach(System.out::println);
        }
        if (isVaccinated.get(Disease.HEPATITISA).equals(false)) {
            System.out.println("Hepatitisa vaccine not given.\n");
            animals.stream().forEach(System.out::println);
        }

    }

    //Methode 6
    public Optional<Animal> findAnimal(Integer animalNo) {
        return animals.stream()
                .filter(animal -> animal.getAnimalNumber().equals(animalNo))
                .findFirst();
    }
    //Methode 7
    public Optional<Animal> findAnimal(String Name) {
        return animals.stream()
                .filter(animal -> animal.getName().equalsIgnoreCase(Name))
                .findFirst();



    }
    //Method 8
    public void treatAnimal(Integer animalNo) //this method will find animal and if present treat him and isClean property will set to true
    {
        Optional<Animal> treatAnimal = animals.stream()
                .filter(animal -> animal.getAnimalNumber().equals(animalNo))
                .findFirst();
        if (treatAnimal.isPresent())
        {
            if(treatAnimal.get() instanceof Dog)
            {
                treatAnimal.get().setClean(true);
                System.out.println("Animal found: ");
                System.out.println(treatAnimal.get());
                Dog dog = new Dog();
                dog.treatAnimal();
            }
            else if (treatAnimal.get() instanceof Cat)
            {
                treatAnimal.get().setClean(true);
                System.out.println("Animal found: ");
                System.out.println(treatAnimal.get());
                Cat cat = new Cat();
                cat.treatAnimal();
            }
            else
            {
                treatAnimal.get().setClean(true);
                System.out.println("Animal found: ");
                System.out.println(treatAnimal.get());
                Monkey monkey = new Monkey();
                monkey.treatAnimal();
            }}
        else
        {
            System.out.println("Animal not found with given no: ");
        }

    }

    //Method 9
    public void treatAnimal(String animalName) // Same as method 8 but search animal with name
    {
        Optional<Animal> treatAnimalName1 = animals.stream()
                .filter(animal -> animal.getName().equals(animalName))
                .findFirst();
        if (treatAnimalName1.isPresent())
    {
        if(treatAnimalName1.get() instanceof Dog)
        {
            treatAnimalName1.get().setClean(true);
            System.out.println("Animal found: ");
            System.out.println(treatAnimalName1.get());
            dog.treatAnimal();
        }
        else if (treatAnimalName1.get() instanceof Cat)
        {
            treatAnimalName1.get().setClean(true);
            System.out.println("Animal found: ");
            System.out.println(treatAnimalName1.get());
            cat.treatAnimal();
        }
        else
        {
            treatAnimalName1.get().setClean(true);
            System.out.println("Animal found: ");
            System.out.println(treatAnimalName1.get());
            monkey.treatAnimal();
        }}
    else
    {
        System.out.println("Animal not found with given no: ");
    }

    }
    //Method 10
    public void treatAllAnimals()           // All animals will cleaned and isClean  property set to true
    {
        ListIterator<Animal> itr = animals.listIterator();
        while (itr.hasNext()) {
            itr.next().setClean(true);             //All animals cleaned and set to true
        }
        dog.treatAnimal();
        cat.treatAnimal();
        monkey.treatAnimal();
    }


    //Method 11
    public Animal findOldestAnimal()
    {
        Animal oldAnimal = animals.stream().max((i1,i2)->i1.getAge().compareTo(i2.getAge())).get();
        return oldAnimal;
    }

    //Method 12
    public int countAnimals()
    {
      return((int)animals.stream().count()) ;
    }

    //Method 13
    public void addAnimal(ArrayList<Animal> animal)
    {
        animal.add(new Dog(415, "Romy_Dog4", 2, false, isVaccinated));
         animalId = 0;

        //A new hash map is created to add list of animal against unigue ID key
        HashMap m = new HashMap();
        ListIterator<Animal> itr = animals.listIterator();
        while (itr.hasNext())
        {
            m.put(animalId+=1, itr.next());               //added key in map  as AnimalId and list of animal as value
        }

        Set s1 = m.entrySet();
        Iterator itrMap  = s1.iterator();
        while (itrMap.hasNext())                            //Iterator used for printing key value pair
        {
            Map.Entry m1 = (Map.Entry)itrMap.next();
            System.out.println("A.ID  :" + m1.getKey() + "--" + m1.getValue());
        }
        System.out.println("Total no. of animals after adding animal  "+ (int)animals.stream().count());

    }
}








