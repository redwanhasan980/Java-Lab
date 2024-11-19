package Overloading;

public class Main {
    public static void main(String[] args) {
        Moverloading m1= new Moverloading();
        ;m1.show();
        System.out.println(m1.show(1));// if there is no method with int parameter this get auto casted to double
        System.out.println(m1.show( 12.1));// if there is no method with double parameter this throw exception

    }
}
