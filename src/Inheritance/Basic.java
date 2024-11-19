package Inheritance;

public class Basic {
 void showUp(){
     System.out.println("1st class");
 }
}
class A extends Basic{

    private int pb=10;
    protected int pd=20;
    public int p=100;
    int a =11 ;
    int b;
    int c;
    void showa()
    {
        System.out.println("method of A");
    }

    void showUp() {
        System.out.println("overiding in A");
    }
    A(int c,int b){
        System.out.println("Constructor A");
        this.c=c;
        this.b=b;

    }
    A(){}
    final void fmed(){}

}
