import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {

    private List<Book> booksList = new ArrayList<>();

    public void add(Book book){

        booksList.add(book);

    }

    public void remove(Book book){

        booksList.remove(book);

    }

    public List<Book> findAll(){
        return Collections.unmodifiableList(booksList);
    }

    public List<Book> findAllGenre(Book.Bookgenre bookgenre){
        List<Book> filteredBooks = new ArrayList<>();
        for(Book book : booksList){
            if(book.getBookGenre().equals(bookgenre)){
                filteredBooks.add(book);
            }
        }
        return Collections.unmodifiableList(filteredBooks);
    }

    public List<Book> findAllBefore(int year){
        List<Book> filteredBooks = new ArrayList<>();
        for(Book book : booksList){
            if(book.getYear() < year){
                filteredBooks.add(book);
            }
        }
        return Collections.unmodifiableList(filteredBooks);
    }

    public Book findMostExpenisve(){
        double maxValue = 0.0;
        for(Book book : booksList){
            if(book.getValue() > maxValue){
                maxValue = book.getValue();
            }
        }
        for(Book book : booksList){
            if(book.getValue() == maxValue){
                return book;
            }
        }
        return null;
    }

    public Book findCheapest(){
        double minValue = Double.MAX_VALUE;
        for(Book book : booksList){
            if(book.getValue() < minValue){
                minValue = book.getValue();
            }
        }
        for(Book book : booksList){
            if(book.getValue() == minValue){
                return book;
            }
        }
        return null;
    }


}



//• dodawanie książek do listy
//        • usuwanie książek z listy
//        • zwracanie listy wszystkich książek
  //      • zwracanie książek typu Fantasy
 //       • zwracanie książek wydanych przed rokiem 1999
 //       • zwracanie najdroższej książki
//        • zwracanie najtańszej książki
