package Thread;

public class RunThread {

        public static void main(String[] args) {
            runnableThread nt=new runnableThread();
            nt.t.start();
            ExtendThread n2 =new ExtendThread();
            runnableThread n3=new runnableThread();
            n3.t.start();
            n2.start();
            System.out.println(n2.getPriority());
            n2.setPriority(10);
            System.out.println(n3.t.isAlive());
            try{
                n3.t.join();
            }
            catch (InterruptedException e){

            }
            System.out.println(n3.t.isAlive());

            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("1 "+i);
                    Thread.sleep(500);
                }
            }
            catch (InterruptedException e)
            {

            }
        }


}
