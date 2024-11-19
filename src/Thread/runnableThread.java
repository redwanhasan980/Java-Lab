package Thread;

public class runnableThread implements Runnable{
    Thread t;
    runnableThread(){
        t=new Thread(this);
    }
    @Override
    public void run() {
        for (int i = 0; i <3; i++) {
            System.out.println("2 "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
