import java.io.*;
public class CheckedUncheckedDemo {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("test.txt");
        } catch (IOException e) {
            System.out.println("Checked Exception caught");
        }
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception caught");
        }
    }
}