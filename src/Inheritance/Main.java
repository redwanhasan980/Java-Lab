package Inheritance;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.showa();
        b.showb();
        b.showa();
        b.showUp();
        a.showUp();
        System.out.println(b.pd);
        B sub = new B();
        a=sub;// giving the referance of the sub class to the super class
      //  a.showb(); not possible because although sub class reference assign to the superclass super class only has the acees of the member of its own and its ancestor.
        a.showa();
        A sup = new A();
        //b= (B) sup; compile but throw error
        //b= sup ; doesnt compile at all
        b.showvalsub();
        b.showvalsup();
        B bnew = new B(15,12);
        System.out.println(bnew.c);
        sup=bnew;
        System.out.println(sup.b);
        // method overrriding
        b.showUp();
        A a1= new A();
        a1.showUp();
        //Dynamic method dispatch is one of the main mechanism of java
        // runtime poly morphism assigning the subclass reference it is determine which version to call
        Basic base =new Basic();
        base.showUp();
        base = a1;
        base.showUp();
        base=b;
        base.showUp();
        base=a1;
        base.showUp();
        // we can control which version to controll using this technique


    }
}
