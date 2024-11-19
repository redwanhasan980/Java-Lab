package Overloading;

public class Moverloading {// Method overloading id the way by which java support polymorphism
              // The type of the parameter and/or the number of the parameter determine which version to call
    void show()
    {
        System.out.println("empty class");

    }
    int show(int a){
         return a;
    }
    void show(int b,int c)
    {
        System.out.println(b);
        System.out.println(c);
    }
    double show(double a)
    {
     return a;
    }

}
