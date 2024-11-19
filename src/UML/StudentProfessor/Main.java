package UML.StudentProfessor;

public class Main {
    public static void main(String[] args) {
        Student student1 =new Student(12,34,"me","2345","@gmail");
        Professor prof1 =new Professor(10,34,54,76,"wer","34","45df");
        String s1= student1.address.output();
        System.out.println(s1);
    }
}
