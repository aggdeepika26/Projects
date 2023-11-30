package StudentProject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class ScoreInfoService {
    private ScoreInfo[] scoreData;

    List<ScoreInfo> scoreList = new ArrayList<ScoreInfo>();
    List<Student>  studentList = new ArrayList<Student>();


//Add students list and marks

    public ScoreInfoService()
    {
        scoreList.add(new ScoreInfo(25, new Student("Rahul", "Sharma")));
        scoreList.add(new ScoreInfo(28, new Student("Gaurav", "Mahajan")));
        scoreList.add(new ScoreInfo(80, new Student("Alisha", "Khan")));
        scoreList.add(new ScoreInfo(98, new Student("Sparsh", "Goel")));
        scoreList.add(new ScoreInfo(99, new Student("Anshika", "Aggarwal")));

    }
    public void getNumberOfStudents()                        // Method to get the total no of students
    {
        System.out.print("Total no. of students are  ");
        System.out.println((Long)scoreList.stream().count());

    }
     public void calculateAverageScore()                  // method to calculate average of the score
    {
        System.out.println();
        Double average = scoreList.stream().mapToInt(i-> i.score).average().orElse(0.0);
        System.out.println("average of the score is : " + average);
    }
    public long filterScore()                       // Method to find the no of students who scored more than and equal to 90
    {
        System.out.println();
        Long scoreGreaterThanNinety = scoreList.stream().filter(i->i.score>=90).count();   // count
        List<ScoreInfo> list = scoreList.stream().filter(i->i.score>90).toList();         //collect the list to get the name and score of student
        System.out.println("Studets who achieved more than and equal to ninety are" );
        list.forEach(i-> System.out.println(i.Name + " " + i.LastName + " " + i.score));  // print the name and score
        return scoreGreaterThanNinety;                                                    // return no of students who scored more than 90
    }


    private ScoreInfo[] getFailedStudent()                                               //find the fail students and convert the list in array
    {
        System.out.println();
        List<ScoreInfo>  listOfFailedStudent  = scoreList.stream().filter(i->i.score<60).toList();
        ScoreInfo[] array1 = listOfFailedStudent.toArray(ScoreInfo[]::new);
        return array1;                                                                // return array of failed students to method printFailingStudents

    }

   public void printFailingStudents() {                                            //Print the name of failed students
       ScoreInfo[] array1 = getFailedStudent();
       System.out.println("List of failed students");
       for (ScoreInfo scoreInfo : array1) {
           System.out.println(scoreInfo.Name + scoreInfo.LastName + "     " + scoreInfo.score);
       }
   }

    public void getDataSortedByLastName()                                         // sort by last name
    {
        System.out.println();
        List<ScoreInfo> sortedList = scoreList.stream().sorted((i1,i2)-> i1.LastName. compareTo(i2.LastName)).collect(Collectors.toList());
        System.out.println("Sorted List according to Last Name is : ");
        sortedList.forEach(i-> System.out.println(i.Name + " " + i.LastName + "     " + i.score));
    }

    public void getDataSortedByScore()                                         // sort by score
    {
        System.out.println();
        List<ScoreInfo> sortedListByScore = scoreList.stream().sorted((i1,i2)-> i1.score.compareTo(i2.score)).collect(Collectors.toList());
        System.out.println("Sorted List according to score is : ");
        sortedListByScore.forEach(i-> System.out.println(i.Name + " " + i.LastName + "     " + i.score));
    }







}




