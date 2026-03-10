public class StringComparisonDemo {
    public static void main(String[] args) {
        String str = "Hello";
        str += " World";
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("String: " + str);
        System.out.println("StringBuilder: " + sb);
        System.out.println("StringBuffer: " + sbf);
    }
}