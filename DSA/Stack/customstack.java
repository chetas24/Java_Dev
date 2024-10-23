package DSA.Stack;

class Stack
{
    private int[] arr;
    private int top;
    private int capacity;

    public Stack(int size)
    {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x)
    {
        if (top == capacity - 1)
        {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    public int pop()
    {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public int size()
    {
        return top + 1;
    }
}

public class customstack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.peek());
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.peek());
    }
}
