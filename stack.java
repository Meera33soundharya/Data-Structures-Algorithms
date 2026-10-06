package Stack;

import java.util.Scanner;

public class stack {

    int size;
    int[] stack;
    int top;

    // Constructor
    stack(int size) {

        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }

    // Push
    public void push(int data) {

        if (top == size - 1) {

            System.out.println("Stack Overflow");
            return;
        }

        top++;
        stack[top] = data;
    }

    // Pop
    public void pop() {

        if (top == -1) {

            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("The pop value is " + stack[top]);
        top--;
    }

    // Peek
    public void peek() {

        if (top == -1) {

            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("The peek value is " + stack[top]);
    }

    // Display
    public void display() {

        if (top == -1) {

            System.out.println("Stack is empty");
            return;
        }

        for (int i = top; i >= 0; i--) {

            System.out.print(stack[i] + " ");
        }

        System.out.println();
    }

    // Main
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        stack s = new stack(size);

        // Push elements
        for (int i = 0; i < size; i++) {

            int data = sc.nextInt();
            s.push(data);
        }

        System.out.println("Stack:");
        s.display();

        s.peek();

        s.pop();

        System.out.println("After pop:");
        s.display();

        sc.close();
    }
}