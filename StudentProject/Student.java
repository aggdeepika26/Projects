package StudentProject;

import org.w3c.dom.ls.LSOutput;

public class Student extends Person{
        private static int incrementId = 0;
        int id;
        public Student()
        {}

        public Student(String name, String lastName)
        {
            super.name = name;
            super.lastName = lastName;
            int id  = getIncrementId();
            System.out.println(id + "   "+ name +"   "+ lastName);
        }


        private static int getIncrementId()
        {
            incrementId+=1;
            return incrementId;
        }

        public static void setIncrementId(int incrementId)
        {
            Student.incrementId = incrementId;
        }



        @Override
        public String toString()

        {
            System.out.println("ID " + "First Name  " +  " Last Name");
            int id = getIncrementId();
            return   ( id + " " +  name + "  " + lastName);

        }

    }

