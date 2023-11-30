package ProjectBook;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Book {
    public String title;
    public LocalDate releaseDate;
    public String genre;
    public Person author;
    public String firstName;
    public String lastName;
    public LocalDate dateOfBirth;



    public Book (String title, Person author , LocalDate releaseDate, String genre) //constructor gemaakt
    {
        this.title = title;
        this.firstName = author.firstName;
        this.lastName = author.lastName;
        this.dateOfBirth = author.dateOfBirth;
        this.genre = genre;
        this.releaseDate = releaseDate;
        System.out.println("Book Title : " + this.title + "    Book Author : "+ this.firstName + " " + this.lastName + "  Date Of Birth  : "+ this.dateOfBirth +"  Release Date  " + this.releaseDate);
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAuthor()
    {
        return this.firstName + this.lastName;
    }


}
