package UML.StudentProfessor;

public class Person {
    public String name;
    public String phoneNumber;
    public String emailAddress;
    Address address;
    Person(String name,String phoneNumber,String emailAddress)
    {
        this.name=name;
        this.emailAddress=emailAddress;
        this.phoneNumber=phoneNumber;
        address = new Address();

    }
    void purchaseParkingPass(){

    }
}
