package Project_Speeltje;

    abstract class AdventureStep
    {
        protected String description;// Description of the current step
        protected AdventureStep choiseToCannibals;// link to the next step that will lead to cannibals
        protected AdventureStep choiseToRescue;//link to the next step that will lead to salvation


        //constructor
        public AdventureStep(String description) {
            this.description = description; //конструктор принимает параметр description,the constructor takes a parameter
// который представляет собой описание шага приключения
//which is a description of an adventure step
        }

        // abstract () for executing the step -выполнения шага приключения
        public abstract AdventureStep performStep();
        //предназначен для выполнения шага приключения и должен быть реализован в каждом конкретном подклассе AdventureStep.
//is intended to perform an adventure step and must be implemented in each specific AdventureStep subclass.
    }

