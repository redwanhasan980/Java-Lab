package Thread;

public class ExtendThread extends Thread{

    ExtendThread(){
        super("Thread 3");
    }
    @Override
    public void run() {
        for (int i = 0; i <3; i++) {
            System.out.println("3 "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

