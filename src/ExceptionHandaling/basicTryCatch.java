package ExceptionHandaling;

public class basicTryCatch {
    public static void main(String[] args) {
        int d=0;
        int a=10;
        try {
            a=a/d;
            System.out.println("after op");
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("after catch ");
    }
}
