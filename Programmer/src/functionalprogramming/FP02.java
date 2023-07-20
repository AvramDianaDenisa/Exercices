package functionalprogramming;

import java.util.List;

public class FP02 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        int sum = addListStructure(numbers);
        System.out.println(sum);
    }

    private static int addListStructure(List<Integer> numbers) {
        int sum =0;
        for(int number:numbers){
            sum+=number;
        }
        return sum;
    }
}
