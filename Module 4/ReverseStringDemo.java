public class ReverseStringDemo {
    public static void main(String[] args) {
        String input = "Java Programming";
        StringBuilder sb = new StringBuilder(input);
        System.out.println("Reversed: " + sb.reverse());
    }
}