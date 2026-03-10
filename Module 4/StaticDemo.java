class StaticExample {
    static int count = 0;
    StaticExample() { count++; }
    static void displayCount() {
        System.out.println("Count: " + count);
    }
}
public class StaticDemo {
    public static void main(String[] args) {
        new StaticExample();
        new StaticExample();
        StaticExample.displayCount();
    }
}