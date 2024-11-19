package UML.StudentProfessor;

public class Student extends Person{
    public int studentNumber;
    public int averageMark;
    Student(int studentNumber,int averageMark,String name, String phoneNumber, String emailAddress)
    {
        super(name,phoneNumber,emailAddress);
        this.studentNumber=studentNumber;
        this.averageMark=averageMark;

    }
    public boolean isEligibleToEnroll(String courseName){
        return true;
    }
    public int getSeminarsToken(){
        return 1001;
    }

}
