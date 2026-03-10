final class FinalClass {
    final int x = 10;
    final void show() {
        System.out.println("Final method, x = " + x);
    }
}
public class FinalKeywordDemo {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.show();
    }
}