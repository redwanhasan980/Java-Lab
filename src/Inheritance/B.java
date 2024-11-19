package Inheritance;

public class B extends A{
    void showb(){
        System.out.println("method B");
    }
//    void showUp(){
//        System.out.println(" Overloaded in b");
//    }
    int a =22 ;
    void showvalsub(){
        System.out.println(a);
    }
    void showvalsup(){
        System.out.println(super.a);// use of super keyword . Its use to refer to the s
        }
        B(){

        }
        B(int c,int b){
           super(c,b);// anothe use of super to refence the construtor of superclass
            System.out.println("constructor B");
        }
        void showUp()
        {
            System.out.println("Overrriding in B");
        }
       //void fmed(){} fmed cannot ovverride because its declare as final
}
