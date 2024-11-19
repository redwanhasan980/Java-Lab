package Generics;

public class Demo {
    public static void main(String[] args) {
        Basic<Integer>obj;
        obj= new Basic<Integer>(34);
        System.out.println(obj.getOb());
        Basic<String>str;
        str = new Basic<String>("Redp");
        System.out.println(str.getOb());
        twotype<Integer,String> two = new twotype<>();
        two.setT(10);
        two.getT();
        bounded<Integer> b1=new bounded<>(12);
        System.out.println(b1);
        b1.getOb();
       // bounded<String>b2=new bounded<String>(); not possible because the Type must inherit Numbers
    }



}
