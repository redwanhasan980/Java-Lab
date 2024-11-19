package Overloading;

public class Main {
    public static void main(String[] args) {
        Moverloading m1= new Moverloading();
        ;m1.show();
        System.out.println(m1.show(1));// if there is no method with int parameter this get auto casted to double
        System.out.println(m1.show( 12.1));// if there is no method with double parameter this throw exception
        Coverloading c1 = new Coverloading();
        c1.show();
        Coverloading c2 = new Coverloading(20);
        c2.show();
        Coverloading c3 = new Coverloading(10,30);
        c3.show();
        Coverloading c4 = new Coverloading(10,30);
        c3.show();
        System.out.println(c3.equalTo(c4));
        staticex st1=new staticex(10);//there is a static variable in the class . static variable are like global
         // all instances of that class share the same variable
        staticex st2=new staticex(20);//  if we change the variable in st2 object the variable will change for
        // the st1 object and for any other object of the class
        st1.show();
        System.out.println(staticex.a); // static variable can be directly access by the name
        //of the class without making any instances of the class.
      staticex.methodx();
        System.out.println(static2.a2);

    }
}
