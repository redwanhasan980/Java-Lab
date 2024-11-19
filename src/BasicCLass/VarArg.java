package BasicCLass;

public class VarArg {
    void show(int a,int b,int ... c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c.length);
        for(var x : c)
            System.out.println( x);
    }
//    void show(int a,int ... c){
//        System.out.println(a);
//        System.out.println("2");
//        System.out.println(c.length);
//        for(var x : c)
//            System.out.println( x);
//    } has ambeguity in overloading the method
}
  class Mn{
     public static void main(String[] args) {
         VarArg a1=new VarArg();
         a1.show(1,2,4,2,1,4,52,1,412,23);
     }

}
