import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private double value;
    private int year;
    private final List<Author> authorList;


    public enum Bookgenre {
            Action, Adventure, ScienceFiction, Novel, Detective, Mystery, Fantasy, Historical, Horror, Romance;
        }

    private Enum bookGenre;

    public Book(String title,
                double value,
                int year,
                List<Author> authorList,
                Bookgenre bookgenre) {
        this.title = title;
        this.value = value;
        this.year = year;
        this.authorList = authorList;
        this.bookGenre = bookgenre;
    }

    //gettery
    public String getTitle() { return title; }

    public double getValue() { return value; }

    public int getYear() { return year; }

    public List<Author> getAuthorList() { return authorList; }

    public Enum getBookGenre() { return bookGenre; }

    //settery
    public void setTitle(String newTitle) { this.title = newTitle; }

    public void setValue(double newValue) { this.value = newValue; }

    public void setYear(int newYear) { this.year = newYear; }

    public void setBookGenre(Enum newBookGenre) { this.bookGenre = newBookGenre; }


    @Override
    public String toString(){
        String output = "";
        output += "Book title = " + title + '\n';
        output += "Book price = " + value + '\n';
        output += "Book year = " + year + '\n';
        output += "Author List = " + authorList + '\n';
        output += "Bookgenre = " + bookGenre + '\n';
        return output;
    }

}
