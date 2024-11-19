package Generics;
//<Textends Superclass>
public class bounded <T extends Number>{
    T ob;
    bounded(T ob){
        this.ob=ob;
    }
    void getOb(){
        System.out.println(ob);
    }
}
