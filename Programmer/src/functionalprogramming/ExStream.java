package functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class ExStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");

        names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }
}

