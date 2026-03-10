class LifeCycleThread extends Thread {
    public void run() {
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        System.out.println("Thread running");
    }
}
public class ThreadLifeCycleDemo {
    public static void main(String[] args) throws InterruptedException {
        LifeCycleThread t = new LifeCycleThread();
        System.out.println("State after creation: " + t.getState());
        t.start();
        System.out.println("State after start: " + t.getState());
        t.join();
        System.out.println("State after completion: " + t.getState());
    }
}