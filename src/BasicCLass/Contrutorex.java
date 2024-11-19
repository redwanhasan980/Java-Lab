package BasicCLass;

public class Contrutorex {
    // constructor is used to initialize variable used in the class for each object so that the object is fully usable object immwdiately
    //this automate initialization process
    int id;
    int id1;
    int id2;
    void display()
    {

    }
    void callDIsplay()
    {
         this.callDIsplay();//this is used to call function of the currect object
    }
    Contrutorex (int id,int id1, int id2){//parameterized constructor
         this.id=id;
         this.id1=id1;//this keyword is used to specify variable of the current object if the pareameterized variable and the current object var has same name.
         this.id2=id2;
    }
    void show()
    {
        System.out.println(id);
        System.out.println(id1);
        System.out.println(id2);
    }
}
