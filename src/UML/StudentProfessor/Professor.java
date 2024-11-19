package UML.StudentProfessor;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Person{
    protected int salary;
    protected int staff;
    private int year;
    public int num;
    List<Student> Students;
    Professor( int salary,
    int staff,
    int year,
    int num,String name, String phoneNumber, String emailAddress){
        super(name,phoneNumber,emailAddress);
        this.num=num;
    this.salary=salary;
    this.staff=staff;
   this.year=year;
   Students =new ArrayList<>(5);
    }


}
