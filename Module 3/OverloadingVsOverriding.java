class Calculator {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}
class AdvancedCalculator extends Calculator {
    @Override
    int add(int a, int b) {
        System.out.println("Overridden method");
        return a + b;
    }
}
public class OverloadingVsOverriding {
    public static void main(String[] args) {
        Calculator c = new AdvancedCalculator();
        System.out.println(c.add(5, 3));
    }
}