package Inheritance;
//abstract method of abstract class must implement/ovveride
//class containing abstract method must be abstract
//abstract method doesnt contain the implementation
//there can be no object of an abstract class
//any subclass of the abstract class can be abstract itself and need not to implements the method
// abstract method cannot have a body;
public abstract class Abstraction {
    abstract void show();
    public void name(){
        System.out.println("redo");
    }
}
 abstract class abs334 extends Abstraction {
}