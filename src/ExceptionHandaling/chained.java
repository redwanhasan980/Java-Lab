package ExceptionHandaling;

public class chained {
    static void chain(){
        NullPointerException e = new NullPointerException("top");
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }

    public static void main(String[] args) {
        try{
            chain();
        }catch (NullPointerException e){
            System.out.println(e);
            System.out.println(e.getCause());
        }
    }
}
