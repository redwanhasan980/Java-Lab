package Interface;
// using interface a class can be fully  abstract
// one interface multiple method

import Inheritance.Basic;

public interface Interfacex {
     default void s1()
     {

     }
    public void s2();
    static int a = 0;// static or final

   private void s4(){
       System.out.println("rerwer");
   }
   static void s5(){
       System.out.println("static");
   }
}
interface i2 extends Interfacex{
    void s5();


}
abstract class c1 implements Interfacex{

}
abstract class c2 extends Basic{

}