package ExceptionHandaling;

import java.util.Scanner;

public class multitrycatch {
    public static void main(String[] args) {
        int d=5;
        int a=10;
        int ar[]=new int[10];
        Scanner scanner =new Scanner(System.in);
        a = scanner.nextInt();

        try {

            a=d/a;
            System.out.println(ar[d]);
            System.out.println("after op");
        }
        catch (ArithmeticException e)// one thing to rememeber is that superclass of exception must come after subclass
        {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bound"+e);
        }
        finally {
            System.out.println("final");
        }
        System.out.println("after catch ");
    }
}
