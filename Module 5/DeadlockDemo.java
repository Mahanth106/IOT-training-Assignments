public class DeadlockDemo {
    public static void main(String[] args) {
        final Object lock1 = new Object();
        final Object lock2 = new Object();
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread1 locked lock1");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (lock2) {
                    System.out.println("Thread1 locked lock2");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread2 locked lock2");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (lock1) {
                    System.out.println("Thread2 locked lock1");
                }
            }
        });
        t1.start();
        t2.start();
    }
}