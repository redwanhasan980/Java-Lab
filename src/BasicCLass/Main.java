package BasicCLass;
public class Main {
    public static void main(String[] args) {
      Intro i1 = new Intro();
      i1.h=10;
        System.out.println(i1);// address or memory location of the object
        System.out.println(i1.h);//content of the object
        class2 i2 =new class2();
        i2.id=2001;
        System.out.println(i2.id);
        System.out.println(i2);//address of object that i2 has the referance
        class2 i3;
        i3=i2; //assigning the referance of i2 to i3 . now they both referance to same object or same memory location

        System.out.println(i3.id);
        System.out.println(i3);// both i2 and i3 refered to same address
        i3=null;
        System.out.println(i3);
     i2.say();
      System.out.println(i2.say1());
        System.out.println(i2.giveme(20));// the value pass from here is the arguments
        System.out.println("Constructors");
        Contrutorex c1 = new Contrutorex(12,33,21);
     c1.show();

    }
}
