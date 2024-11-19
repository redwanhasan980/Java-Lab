package ExceptionHandaling;

public class usethrow {
    public static void main(String[] args) {
        int age =-5;
        try{
            checkage(age);

        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    public static void checkage(int age){
        if(age<0)
        {
           IllegalArgumentException e= new IllegalArgumentException ("Invalid age");
           throw e;

        }
        System.out.println("age is valid");
    }

}
