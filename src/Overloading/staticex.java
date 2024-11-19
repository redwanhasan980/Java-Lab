package Overloading;

public class staticex {
    static int a ;
    final int A = 120;
    staticex (){}
     staticex(int a){
         this.a =a;
     }
     void show()
     {
         System.out.println(a);
     }
     static void methodx()
     {
         System.out.println("this is a static method");
         //just as the static variable static method can be called by the class name . also all the instances
         // will share the same method
         // static method can only call another static method or variable .
         static2.show();

         //
     }
     void change(){
         //this.A=20; not possible because A is final ( constant)
     }
}
