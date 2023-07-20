package Collection;
import java.lang.*;
import java.io.*;
public class Exceptii {

    public static void main(String[] args) {
        try {

            int a[] = new int[5];
            a[5] = 30 / 5;
            //a[1] = 30/0;
        } catch (ArithmeticException e) {

            System.out.println("ArithmeticException occurs");
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("ArrayIndexOutOfBoundsException occurs");
        }finally {
            System.out.println("This output is finally");
        }

    }
}


