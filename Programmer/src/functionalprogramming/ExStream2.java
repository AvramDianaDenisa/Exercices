package functionalprogramming;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExStream2 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Sebi", 30));
        people.add(new Person("Diana", 25));
        people.add(new Person("Teo", 40));
        people.add(new Person("Mihai", 22));

        // Folosim Stream pentru a filtra și a obține o listă de nume ale persoanelor care au vârsta sub 30 de ani
        List<String> youngPeopleNames = people.stream()
                .filter(person -> person.getAge() < 30)
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println("Young people names: " + youngPeopleNames);
    }
}
