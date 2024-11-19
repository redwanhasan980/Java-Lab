package ExceptionHandaling;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        int a = 10;
        int b;
        Scanner scanner = new Scanner(System.in);
        b = scanner.nextInt();
        try {
            a=a/b;
            System.out.println("1 pass");
             try {
                 a=a/(b-1);
                 System.out.println("2 pass");
                 try {
                     a=a/(b-2);
                     System.out.println("3 pass");
                 }
                 catch (ArithmeticException e)
                 {
                     System.out.println("catch 3");
                 }
             }catch (ArithmeticException e)
             {
                 System.out.println("catch 2");
             }
        }
        catch (ArithmeticException e)
        {
            System.out.println("catch 1");
        }
    }
}
