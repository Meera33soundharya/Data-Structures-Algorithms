package Queue;

public class QueueWithArray {

    int size;
    int[] arr;
    int front;
    int rear;

    QueueWithArray(int size) {
        this.size = size;
        this.front = -1;
        this.rear = -1;
        this.arr = new int[size];
    }

    void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        arr[rear] = data;
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Underflow");
            return;
        }

        System.out.println("Deleted: " + arr[front]);
        front++;
    }

    void peek() {
        if (front == -1 || front > rear) {
            System.out.println("Underflow");
            return;
        }

        System.out.println("Front: " + arr[front]);
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Underflow");
            return;
        }

        System.out.println("Queue elements:");

        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        QueueWithArray q = new QueueWithArray(5);

        q.enqueue(9);
        q.enqueue(10);
        q.enqueue(7);

        q.display();

        q.dequeue();

        q.display();

        q.peek();
    }
}