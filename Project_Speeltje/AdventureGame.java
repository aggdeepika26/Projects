package Project_Speeltje;

import java.util.Scanner;

    public class AdventureGame {

        public void startAdventure() {

            //public void startAdventure(){

//позволяет пользователю делать выбор

            Scanner scanner = new Scanner(System.in);// для считывания ввода пользователя с клав

            do { // испол для того что бы игра повторялась, если польз решит сыграть заново

                System.out.println("Welcome to Island Adventures!");

                System.out.println("You find yourself on a deserted island, and your goal is to leave it.");

                // // Создаем шаги приключения

                AdventureStep step1 = new AdventureScenario("You wake up on the beach, the memory of the past is lost. There is a fork in the road in front of you.");

                AdventureStep step2 = new AdventureScenario("You found traces of people on the shore.");

                AdventureStep step3 = new AdventureScenario("A ship is visible in the distance; rescue is possible.");

                AdventureStep step4 = new AdventureScenario("You hear a strange noise in the forest.");

                AdventureStep step5 = new AdventureScenario("You have discovered an underwater cave.");

                AdventureStep step6 = new AdventureScenario("Smoke from the fire rises in the air.");

// Устанавливаем связи между шагами

                step1.choiseToCannibals = step2;

                step1.choiseToRescue = step2;

                step2.choiseToCannibals = step3;

                step2.choiseToRescue = step3;

                step3.choiseToCannibals = step4;

                step3.choiseToRescue = null;

                step4.choiseToCannibals = step6;

                step4.choiseToRescue = step5;

                step5.choiseToCannibals = step6;

                step5.choiseToRescue = step6;

                step6.choiseToCannibals = null;

                step6.choiseToRescue = new AdventureStep("Hurray. You are saved!") {

                    @Override

                    public AdventureStep performStep() {// Метод для выполнения текущего шага приключения

                        System.out.println(description);// Выводим описание текущего шага

                        return null; // Возвращаем null, так как этот метод будет переопределен в подклассах

                    }

                };

                ////let's start the adventure

                AdventureStep currentStep = step1;  //tracks the current step of the adventure

                while (currentStep != null) {  // currentStep отслеживает текущий шаг прикл

                    currentStep = currentStep.performStep(); // игра выполняется до тех пор пока не станет =null

                    //performStep() обрабатывает решения игрока и возвращает следующий шаг.

                }

                System.out.println("Thanks for playing! Do you want to play again? (Yes/No) :");

            } while (scanner.next().equalsIgnoreCase("yes"));

            System.out.println("Thank you for playing! See you on new adventures!");

        }

    }
