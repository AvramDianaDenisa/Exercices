package functionalprogramming;

import java.util.List;

public class FP01 {
    public static void main(String[] args) {
        List<Integer> numbers =List.of(12,9,13,4,6,2,4,12,15);
        List<String> cours = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
        printAllNumbersInListStructure(numbers);
        System.out.println();
        printEvenNumbersInListStructure(numbers);
        System.out.println();
        printOddNumbersInListStructure(numbers);
        System.out.println();
        printAllCoursesInListStructure(cours);
    }
    private static void printAllCoursesInListStructure(List<String> courses) {
        for (String cours:courses){
            System.out.println(courses);
        }
    }
    private static void printAllNumbersInListStructure(List<Integer> numbers) {
        for (int number:numbers){
            System.out.println(number);
        }
    }
    private static void printEvenNumbersInListStructure(List<Integer> numbers) {
        for (int number:numbers){
            if(number%2==0) {
                System.out.println(number);
            }
        }
    }

    private static void printOddNumbersInListStructure(List<Integer> numbers) {
        for (int number:numbers){
            if(number%2!=0) {
                System.out.println(number);
            }
        }
    }
}
