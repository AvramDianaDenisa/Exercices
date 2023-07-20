package functionalprogramming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {

        List<Integer> numbers =List.of(12,9,13,4,6,2,4,12,15);
        List<String> cours = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");

        printAllNumbersInListFunctional(numbers);
        System.out.println();
        printEvenNumbersInListFunctional(numbers);
        System.out.println();
        printOddNumbersInListFunctional(numbers);
        System.out.println();
        printAllCoursesInListFunctional(cours);
        System.out.println();
        printSquareOfTheNumbersInListFunctional(numbers);


    }
//private static  void print(int number){
//    System.out.println(number);
//}
    private static boolean isEven(int number){
        return number%2==0;
    }
    //number -> number%2==0


    private static void printAllCoursesInListFunctional(List<String> numbers) {

        numbers.stream()
                .forEach(System.out::println); // Method Reference
        // .forEach(FP01Functional::print)

    }
    private static void printAllNumbersInListFunctional(List<Integer> numbers) {

        numbers.stream()
                .forEach(System.out::println); // Method Reference
        // .forEach(FP01Functional::print)

    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {

        numbers.stream()
                //.filter(FP01Functional::isEven) //Filter - Only Allow Even Numbers
                .filter( number -> number%2==0)//LambdaExpression
                .forEach(System.out::println); // Method Reference
    }

    private static void printOddNumbersInListFunctional(List<Integer> numbers) {

        numbers.stream()
                //.filter(FP01Functional::isEven) //Filter - Only Allow Even Numbers
                .filter( number -> number%2!=0)//LambdaExpression
                .forEach(System.out::println); // Method Reference
    }
    private static void printSquareOfTheNumbersInListFunctional(List<Integer> numbers) {
           numbers.stream()
                   //mapping - x->x*x
                   .map(number->number*number)//MappingExpresion
                .forEach(System.out::println); // Method Reference
    }
}
