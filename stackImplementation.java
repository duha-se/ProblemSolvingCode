
public class Stack {
    private int[] stackArray;
    private int top;
    private int maxSize;

    // Constructor to initialize the stack
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;  // Indicates that the stack is empty
    }

    public void push(int value) {
        if (top >= maxSize - 1) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed onto stack.");
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;  // Indicates that the stack is empty
        } else {
            int value = stackArray[top--];
            System.out.println(value + " popped from stack.");
            return value;
        }
    }

    public int size() {
        return top + 1;
    }

    
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Size of stack: " + stack.size());

        stack.pop();
        stack.pop();

        System.out.println("Size of stack after popping: " + stack.size());
    }
}
