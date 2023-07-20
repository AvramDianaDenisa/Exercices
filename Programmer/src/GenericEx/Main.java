package GenericEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Definim o interfață generică care specifică că elementele sunt comparabile între ele.
interface Comparable<T> {
    int compareTo(T other);
}
public class Main {
    public static void main(String[] args) {
        GenericCollection<Person> personCollection = new GenericCollection<>();

        // Adăugăm persoane în colecție
        personCollection.addItem(new Person("Sebastian", 52));
        personCollection.addItem(new Person("Diana", 22));
        personCollection.addItem(new Person("Ana",82));
        personCollection.addItem(new Person("Delia", 51));


        // Afișăm colecția înainte de sortare
        System.out.println("Inainte de sortare:");
        personCollection.printItems();

        // Sortăm colecția
        personCollection.sortItems();

        // Afișăm colecția după sortare
        System.out.println("\nDupa sortare:");
        personCollection.printItems();
    }
}
