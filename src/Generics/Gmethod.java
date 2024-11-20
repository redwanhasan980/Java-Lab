package Generics;

public class Gmethod {
    public static <T extends Comparable<T>> T printg( T a,T b){
         if(a.compareTo(b)>0)
        return a;
         else
             return b;
    }
}
