import java.util.Stack;

public class MyQueue {
    private Stack<Integer> inbox;
    private Stack<Integer> outbox;

    public MyQueue() {
        inbox = new Stack<>();
        outbox = new Stack<>();
    }

    public void push(int x) {
        inbox.push(x);
    }

    public int pop() {
        transfer();
        return outbox.pop();
    }

    public int peek() {
        transfer();
        return outbox.peek();
    }

    public boolean empty() {
        return inbox.isEmpty() && outbox.isEmpty();
    }

    private void transfer() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) outbox.push(inbox.pop());
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());  // 1
        System.out.println(queue.pop());   // 1
        System.out.println(queue.empty()); // false
    }
}
