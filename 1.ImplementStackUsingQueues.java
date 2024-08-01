//1339639546
import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    
    public void push(int x) {
        queue2.add(x);
        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }
    
    public int pop() {
        if (queue1.isEmpty()) {
            System.err.println("Stack is empty");
            return -1;
        }
        return queue1.remove();
    }
    
    public int top() {
        if (queue1.isEmpty()) {
            System.err.println("Stack is empty");
            return -1;  
        }
        return queue1.peek();
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }
}
