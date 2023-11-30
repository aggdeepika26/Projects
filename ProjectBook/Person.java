package ProjectBook;
import java.time.LocalDate;

import java.time.LocalDate;

public class Person
{
    public String firstName;
    public String lastName;
    public LocalDate dateOfBirth;

    public Person(String firstName,String lastName, LocalDate dateOfBirth)  //constructor gemaakt
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}


