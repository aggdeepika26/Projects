package StudentProject;

public class ScoreInfoApp {

        public static void main(String[] args)
        {

            ScoreInfoService scoreInfoService = new ScoreInfoService();  //ScoreInfoService Object

            scoreInfoService.getNumberOfStudents();                      // aanroepen getNumberOfStudents()
            scoreInfoService.calculateAverageScore();                    //aanroepen calculateAverageScore()

            long scoreGreaterThanNinety = scoreInfoService.filterScore();  // aanroepen en krijg result
            System.out.println("Total Students are  : " + scoreGreaterThanNinety);

            scoreInfoService.printFailingStudents();                      // aanroepen printFailingStudents()
            scoreInfoService.getDataSortedByLastName();                   // aanroepen getDataSortedByLastName()
            scoreInfoService.getDataSortedByScore();                      // aanroepen getDataSortedByScore()
        }
}
