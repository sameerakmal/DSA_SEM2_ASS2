//1339653766
class CustomStack {
private int[] stack;
private int[] increment;
private int size;
private int maxSize;

public CustomStack(int maxSize) {
    this.maxSize = maxSize;
    this.stack = new int[maxSize];
    this.increment = new int[maxSize];
    this.size = 0;
}

public void push(int x) {
    if (size < maxSize) {
        stack[size] = x;
        size++;
    }
}

public int pop() {
    if (size == 0) {
        return -1;
    }
    size--;
    int result = stack[size] + increment[size];
    if (size > 0) {
        increment[size - 1] += increment[size];
    }
    increment[size] = 0; 
    return result;
}

public void increment(int k, int val) {
    int limit = Math.min(k, size);
    if (limit > 0) {
        increment[limit - 1] += val;
    }
}
}
