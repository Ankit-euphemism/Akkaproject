package COM_ANK.ANkit.Ob;

public class Any_thread_1 {
    public static void main(String[] args) throws InterruptedException {
        A a1 = new A();
        Thread t1 = new Thread(a1);
        t1.start();
        Thread t2 = new Thread(a1);
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println (e);
        }
    }
}
class A implements Runnable {
    int sum;

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("inside A thread");
            sum = sum + i;
        }
    }
}
