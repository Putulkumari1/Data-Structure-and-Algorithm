class CircularQueue {
    int[] arr;
    int front, rear, size, capacity;

    CircularQueue(int cap) {
        capacity = cap;
        arr = new int[cap];
        front = 0;
        size = 0;
        rear = cap - 1;
    }

    void enqueue(int x) {
        if (size == capacity) {
            System.out.println("Queue is Full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
        System.out.println(x + " inserted");
    }

    void dequeue() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(arr[front] + " removed");
        front = (front + 1) % capacity;
        size--;
    }

    int getFront() {
        if (size == 0) return -1;
        return arr[front];
    }

    int getRear() {
        if (size == 0) return -1;
        return arr[rear];
    }
}

public class CircularqueueImp {
    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(3);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Front: " + q.getFront()); // 10
        System.out.println("Rear: " + q.getRear());   // 30

        q.dequeue(); // remove 10
        q.enqueue(40); // circular insert

        System.out.println("Front: " + q.getFront()); // 20
        System.out.println("Rear: " + q.getRear());   // 40
    }
}

