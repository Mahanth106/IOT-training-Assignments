class MyThread extends Thread {
    public void run() {
        System.out.println("Thread using Thread class");
    }
}
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable interface");
    }
}
public class ThreadCreationDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread t2 = new Thread(new MyRunnable());
        t1.start();
        t2.start();
    }
}