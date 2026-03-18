import java.util.Stack;

public class EvalRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            switch (token) {
                case "+": stack.push(stack.pop() + stack.pop()); break;
                case "-":
                    int b = stack.pop(), a = stack.pop();
                    stack.push(a - b);
                    break;
                case "*": stack.push(stack.pop() * stack.pop()); break;
                case "/":
                    int divisor = stack.pop(), dividend = stack.pop();
                    stack.push(dividend / divisor);
                    break;
                default: stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        EvalRPN obj = new EvalRPN();
        System.out.println(obj.evalRPN(new String[]{"2","1","+","3","*"}));          // 9
        System.out.println(obj.evalRPN(new String[]{"4","13","5","/","+"}));         // 6
        System.out.println(obj.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"})); // 22
    }
}
