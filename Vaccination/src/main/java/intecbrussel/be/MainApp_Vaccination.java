package intecbrussel.be;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import java.util.Scanner;

public class MainApp_Vaccination {
    public static void main(String[] args) {
        ArrayList<Animal> anilmalList = new ArrayList<>();

        HashMap<Disease, Boolean> isVaccinated = new HashMap<>();
        isVaccinated.put(Disease.CHICKENPOCKS, false);
        isVaccinated.put(Disease.FLUE, false);
        isVaccinated.put(Disease.POLIO, false);
        isVaccinated.put(Disease.HEPATITISA, false);
        anilmalList.add(new Dog(213, "Jacky_Dog1", 5, false, isVaccinated));
        anilmalList.add(new Dog(123, "Sheru_Dog2", 2, false, isVaccinated));
        anilmalList.add(new Dog(100, "Tomy_Dog3", 1, false, isVaccinated));

        anilmalList.add(new Cat(456, "Lucy_Cat1", 4, false, isVaccinated));
        anilmalList.add(new Cat(130, "Micy_Cat2", 1, false, isVaccinated));
        anilmalList.add(new Cat(89, "Micky_Cat3", 6, false, isVaccinated));

        anilmalList.add(new Monkey(45, "Bholu_Monkey1", 1, false, isVaccinated));
        anilmalList.add(new Monkey(76, "Golu_Monkey2", 5, false, isVaccinated));
        anilmalList.add(new Monkey(34, "Bhima_Monkey3", 7, false, isVaccinated));
        anilmalList.add(new Monkey(67, "Molu_Monkey4", 3, false, isVaccinated));


        AnimalShelter animalShelter = new AnimalShelter(anilmalList, isVaccinated);
        //Method 1
        System.out.println("Method 1\n");
        System.out.println("List after ChickenPox and Polio vaccination making true");
        animalShelter.printAnimals();
        System.out.println("************************************************************************");


        //Method 2
        System.out.println("Method 2\n");
        animalShelter.sortAnimals();
        System.out.println("************************************************************************");

        //Method 3
        System.out.println("Method 3\n");
        animalShelter.sortAnimalsByName();
         System.out.println("************************************************************************");


         //Method 4
        System.out.println("Method 4\n");
        animalShelter.sortAnimalsByAge();
         System.out.println("************************************************************************");

        //Method 5
        System.out.println("Method 4\n");
        animalShelter.printAnimalsNotVaccinated(Disease.POLIO);
        System.out.println("************************************************************************");


        //Method 6
        System.out.println("Method 6\n");
        System.out.println("Enter animal no. that you want to search");
        Scanner myScanner = new Scanner(System.in);
        Integer animalNo = myScanner.nextInt();
        Optional<Animal> foundAnimal = animalShelter.findAnimal(animalNo);
        if (foundAnimal.isPresent()) {
            System.out.println("Animal found: ")  ;
            System.out.println(foundAnimal.get());
        } else {
            System.out.println("Animal not found with animal number: ");
        }
        System.out.println();
        System.out.println("*****************************************************************");


        //Method 7
        System.out.println("Method 7\n");
        System.out.println("Enter animal name that you want to search");

        String animalName = myScanner.next();

        Optional<Animal> foundAnimalByName = animalShelter.findAnimal(animalName);

        if (foundAnimalByName.isPresent()) {
            System.out.println("Animal found: ");
            System.out.println(foundAnimalByName.get());
        } else {
            System.out.println("Animal not found with given name: ");
        }
        System.out.println();
        System.out.println("*****************************************************************");
                                                                                                 //Method 8

        //Method 8
        System.out.println("Method 8\n");
        System.out.println("Enter animal no that you want to treat");

        Integer animalNo1 = myScanner.nextInt();
        animalShelter.treatAnimal(animalNo1) ;
        System.out.println();
        System.out.println("*****************************************************************");


        //Method 9
        System.out.println("Method 9\n");
        System.out.println("Enter animal name that you want to treat");
        String treatAnimalName = myScanner.next();
        animalShelter.treatAnimal(treatAnimalName);
        System.out.println();
        System.out.println("*****************************************************************");


        //Method 10
         System.out.println("Method 10\n");
         animalShelter.treatAllAnimals();
         System.out.println();
         System.out.println("*****************************************************************");



        //Method 11
        System.out.println("Method 11\n");
        System.out.println("Oldest Animal is  :");
        Animal oldestAnimal = animalShelter.findOldestAnimal();
        System.out.println(oldestAnimal);
        System.out.println();
        System.out.println("*****************************************************************");

        //Method 12
        System.out.println("Method 12\n");
        int countAnimals = animalShelter.countAnimals();
        System.out.println("Total no. of animals are before update :" + countAnimals);
        System.out.println();
        System.out.println("*****************************************************************");


        //Method 13
         System.out.println("Method 13\n");
         animalShelter.addAnimal(anilmalList);
         System.out.println();
         System.out.println("*****************************************************************");
    }



}