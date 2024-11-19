package BasicCLass;

public class Stack {
    int stack[] =new int[10];
    int tos;
    Stack(){
        tos=-1;
    }
    void push(int it)
    {
         if(tos==9)
             System.out.println("Stack Overflow");
         else
             stack[++tos] = it;
    }
    int top(){
         if(tos<0){
             System.out.println("underflow");
             return 0;
         }
         else
         {
             return stack[tos--];
         }
    }

}
class TestStack{
    public static void main(String[] args) {
        Stack my1= new Stack();
       my1.push(10);
       my1.push(12);
        System.out.println(my1.top());
    }
}
