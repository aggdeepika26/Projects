
package ProjectBook;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.time.LocalDate;
public class BookApp {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<Book>();
        List<Person> authors = new ArrayList<Person>();
        //Adding Books and author details for the constructor in Book and Person class
        bookList.add(new Book("Programming With Python", new Person("Sumita", "Arora", LocalDate.of(1980, 11, 12)), LocalDate.of(2015, 11, 13), "ver 5"));
        bookList.add(new Book("Head First Java", new Person("Kathy ", "Sierra", LocalDate.of(1985, 12, 15)), LocalDate.of(2016, 10, 19), "ver 2"));
        bookList.add(new Book("Programming With C++", new Person("Dennis", "Ritchie", LocalDate.of(1980, 10, 14)), LocalDate.of(2019, 11, 13), "ver 1"));
        bookList.add(new Book("Programming in Java", new Person("Sumita", "Arora", LocalDate.of(1980, 11, 12)), LocalDate.of(2016, 10, 19), "ver 2"));
        bookList.add(new Book("The C Programming Language", new Person("Dennis", "Ritchie", LocalDate.of(1980, 10, 14)), LocalDate.of(2019, 11, 13), "ver 1"));

        Book newBook = getNewestBook(bookList);// static Methode aanroepen
        System.out.println("Book title is : " + newBook.getTitle());
        System.out.println("Book Author is :" +  newBook.getAuthor());
        System.out.println("Book Release Date is  :" +newBook.getReleaseDate());

        printYoungestWriter(bookList);        //static Methode aanroepen
        System.out.println();
        sortedByTitle(bookList);              //static Methode aanroepen

        System.out.println();
        BooksByPerAuthor(bookList);          //static Methode aanroepen

        System.out.println();
        printBooksReleasedIn2016(bookList);
    }

    public static Book getNewestBook(List<Book> books)
    {
        System.out.println("Newest book is");
        Book newBook =  books.stream().max((i1,i2)->i1.getReleaseDate().compareTo(i2.getReleaseDate())).get();
        return newBook;
    }
    public static void printYoungestWriter(List<Book> books)
    {
        System.out.println();
        Book youngestWriter = books.stream().min((i1,i2)->i1.getDateOfBirth().compareTo(i2.getDateOfBirth())).get();
        System.out.println("Youngest Writer is  " + youngestWriter.firstName + " " + youngestWriter.lastName);
    }

    public static void sortedByTitle(List<Book> books)
    {
        System.out.println("Sorted List of books are ");
        List<Book> sortedBook = (books.stream().sorted((i1,i2)->i1.getTitle().compareTo(i2.getTitle())).collect(Collectors.toList()));
        sortedBook.stream().forEach(book -> System.out.println(book.title));
    }
    public static void BooksByPerAuthor(List<Book> books)
    {
        System.out.println("Books written by per author");
        Map<String, Long> bookmap = books.stream().collect(Collectors.groupingBy(author-> author.getAuthor(),Collectors.counting()));
        System.out.println(bookmap);
    }

    public static void printBooksReleasedIn2016(List<Book> books)
    {
        System.out.println("Books printed in 2016");
        List<Book> bookPrintedInYear = books.stream().filter(i-> i.getReleaseDate().getYear() == 2016 ).toList();
        bookPrintedInYear.stream().forEach(book -> System.out.println(book.title + "  " + book.getReleaseDate()));
    }
}


