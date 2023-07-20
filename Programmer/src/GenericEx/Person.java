package GenericEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Clasa care implementează interfața Comparable pentru a permite sortarea elementelor.
class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " - " + age + " years old";
    }
}