package Thread;

public class Basic {//controlling the main thread
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t);
        t.setName("redo");
        System.out.println(t);
        try{
            for(int i=0;i<5;i++)
            {
                System.out.println(i);
               Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
