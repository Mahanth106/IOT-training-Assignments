class MyException extends Exception {
    MyException(String message) { super(message); }
}
public class CustomExceptionDemo {
    static void check() throws MyException {
        throw new MyException("Custom Exception Thrown");
    }
    public static void main(String[] args) {
        try {
            check();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}