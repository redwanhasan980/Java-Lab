package Overloading;

public class Coverloading {
    int a;
    int b;
    int c;
    Coverloading(int a)
    {
        this.a=a;
    }
    Coverloading(int a, int c)
    {
         this.a=a;
         this.c=c;
    }
    Coverloading(){

    }
    void show(){
        System.out.println(a); System.out.println(b); System.out.println(c);
    }
    boolean equalTo(Coverloading c)
    {
         if(c.a==this.a&&c.b==this.b)
             return true;
         else
             return false;
    }

}
