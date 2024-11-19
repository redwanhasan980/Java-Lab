package Interface;

import Inheritance.Basic;

public class implimentation extends Basic implements Interfacex {
    @Override
    public void s1() {
        System.out.println("me");
    }

    @Override
    public void s2() {
        System.out.println("you");
    }
    public void own()
    {
        System.out.println("own");
    }


}
class Mn{
    public static void main(String[] args) {
        Interfacex i1 = new   implimentation();
        i1.s1();
        i1.s2();
        //i1.own(); reference of the interface can only use  the method of the interface
        ((implimentation) i1).own();
        Interfacex.s5();
    }
}

