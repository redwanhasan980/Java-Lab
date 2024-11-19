package Inheritance;

public class AbsMain extends Abstraction{
    @Override
    void show() {
        System.out.println("SHowing");
    }
}
abstract class abs3 extends Abstraction {
}
class man{
    public static void main(String[] args) {
        AbsMain a1=new AbsMain();
        a1.name();
        a1.show();
    }
}
