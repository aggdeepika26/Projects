package StudentProject;

public class ScoreInfo {

        Integer score;
        Student student;
        String Name;
        String LastName;
        public ScoreInfo(int score, Student student)
        {
            this.score = score;
            this.Name = student.name;
            this.LastName = student.lastName;
        }

        public int getScore() {
            return score;
        }

       @Override
        public String toString() {
            {
                return  student.name +  student.lastName +  score;
            }
        }
    }

