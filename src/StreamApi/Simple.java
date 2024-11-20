package StreamApi;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Simple {
    public static void main(String[] args) {
        ArrayList<Integer>myList =new ArrayList<>();
         int ar[]={23,45,2,65,74,3};
         for(var x : ar)
             myList.add(x);
        myList.add(12);
        myList.add(34);
        System.out.println(myList);
        Stream<Integer> ms =myList.stream();
        Optional<Integer>min=ms.min(Integer::compare);
        System.out.println(min);
        ms= myList.stream().sorted().filter((n)->(n%2==1)).filter((n)->n>5);
        System.out.println(ms);
        ms.forEach((n)-> System.out.println(n));


    }
}
