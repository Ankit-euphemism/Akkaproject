package COM_ANK.ANkit.Ob;
public class Any_thread {
    public static void main(String[] args) {
      Mythread mt=new Mythread ();
      Thread th1=new Thread (mt);
      th1.start ();
      Thread th2=new Thread (mt);
      th2.start ();
    }
}
class Mythread implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<=100;i++) {
            try {
                Thread.sleep (1000);
                System.out.println ("This is a thread:-"+i);
            } catch (InterruptedException e) {
                 e.printStackTrace ();
            }
        }
    }
}
