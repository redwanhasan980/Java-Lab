package Generics;

public class twotype<T,G>{
    T ob1;
    G ob2;
    void setT(T ob1)
    {
        this.ob1=ob1;
    }
    void getT(){
        System.out.println(ob1);
    }
}
