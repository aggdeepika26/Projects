package Project_Speeltje;
import java.util.Scanner;

public class AdventureScenario extends AdventureStep {
    //constructor

    public AdventureScenario(String description) {
        super(description); //call from the super class - Description of the current step.
    }

    //Implement the performStep method for the adventure scenario
    @Override
    public AdventureStep performStep() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(description);
        System.out.println("1.Continue following the footsteps on the beach.");
        System.out.println("2.Change your path.");

        int userChoise; //Variable to store the user's choice
        do {
// Loop to ensure user selects correctly (1 or 2)  Цикл для обеспечения правильного выбора пользователя (1 или 2)
            System.out.println("Select an action (1-2): ");
            userChoise = scanner.nextInt();
        } while (userChoise != 1 && userChoise != 2);
// Check the user's selection and take appropriate action // Проверка выбора пользователя и выполнение соответствующих действий
        if (userChoise == 1) {
            System.out.println("You decide to continue following the footsteps on the beach.");
// Check if there is a next step towards cannibals // Проверка, есть ли следующий шаг в направлении к людоедам
            if (choiseToCannibals == null) {
                System.out.println("But the journey is over. The cannibals surrounded you. End of the adventure.");
                return null;// Return null to end the adventure // Возвращаем null, чтобы завершить приключение
            } else {
                return choiseToCannibals; // Return the next step towards cannibals// Возвращаем следующий шаг в направлении к людоедам
            }
        } else {
            System.out.println("You decide to change your path.");


// Checking if there is a next step towards salvation
            if (choiseToRescue == null) {
                System.out.println("However, you find no salvation. You are surrounded by cannibals and your adventure is over.");
                return null;// Return null to end the adventure
            } else {
                return choiseToRescue; // Возвращаем следующий шаг в направлении к спасению
// Return the next step towards salvation
            }
        }
    }
}

