import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

    // Zadanie 1

       Book book1 = new Book("Wiedzmin1", 20.50, 2010, List.of(new Author("Andrzej", "Sapkowski", "Mezczyzna")), Book.Bookgenre.Fantasy);
       Book book2 = new Book("Metro", 30.50, 2015, List.of(new Author("Dmitry", "Glukhovsky", "Mezczyzna")), Book.Bookgenre.Adventure);
       Book book3 = new Book("Wiedzmin2", 19.50, 2012, List.of(new Author("Andrzej", "Sapkowski", "Mezczyzna")), Book.Bookgenre.Fantasy);

        BookService bookService = new BookService();
        bookService.add(book1);
        bookService.add(book2);
        bookService.add(book3);

        System.out.println("Zadanie 1 \n");

        System.out.println("\t WSZYSTKIE KSIAZKI \n");

        System.out.println(bookService.findAll());

        System.out.println("\t KSIAZKI FANTASY \n");

        System.out.println(bookService.findAllGenre(Book.Bookgenre.Fantasy));

        System.out.println("\t KSIAZKI PRZED 1999 \n");

        System.out.println(bookService.findAllBefore(1999));

        System.out.println("\t NAJDROZSZA KSIAZKA \n");

        System.out.println(bookService.findMostExpenisve());

        System.out.println("\t NAJTANSZA KSIAZKA \n");

        System.out.println(bookService.findCheapest());

        System.out.println("\t PRZED USUNEICIEM \n");

        System.out.println("Ilosc ksiazek: " + bookService.findAll().size());

        bookService.remove(book1);

        System.out.println("\t PO USUNIECIU \n");

        System.out.println("Ilosc ksiazek: " + bookService.findAll().size());


        // Zadanie 2

        final int MIN_VALUE = 0;
        final int MAX_VALUE = 50;

    // lista 100 losowych elementów zakres: 0-50

        List<Integer> elements = new ArrayList();
        for(int i = 0; i < 100; i++){
            elements.add(ThreadLocalRandom.current().nextInt(MIN_VALUE, MAX_VALUE + 1));
        }

        System.out.println(" ");
        System.out.println("Zadanie 2 \n");

        //lista z losowo wygenerowanymi wartosciami
        System.out.println("Lista 100 elementów wybranych losowo w przedziale 0-50: ");
        System.out.println(elements);

        //unikalne wartosci z listy
        System.out.println("Unikalne wartosci z listy: ");
        System.out.println(uniqueValues(elements));

        //powtórzone wartości
        System.out.println("Powtórki w liscie: ");
        System.out.println(moreThanOne(elements));

    }

    // Unikalne wartości

    public static List<Integer> uniqueValues(List<Integer> intList){

        Set<Integer> uniqueValues = new HashSet(intList);
        return new ArrayList(uniqueValues);
    }



    // Powtórzone wartości

    public static List<Integer> moreThanOne(List<Integer> intList){

        List<Integer> moreThanOne = new ArrayList();
        List<Integer> values  = uniqueValues(intList);
        for(Integer value : values){
            int counter = 0;
            for(Integer element : intList){
                if(element.equals(value))
                    counter++;
            }
            if(counter>1)
                moreThanOne.add(value);
        }
        return moreThanOne;
    }


}
