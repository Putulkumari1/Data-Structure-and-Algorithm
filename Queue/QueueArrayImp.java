class QueueArrayImp{
    int[] arr;
    int capacity;
    int size;

    // Constructor
    QueueArrayImp(int cap) {
        capacity = cap;
        arr = new int[cap];
        size = 0;
    }

    // Enqueue (Insert)
    void enqueue(int x) {
        if (size == capacity) {
            System.out.println("Queue Overflow");
            return;
        }
        arr[size] = x;
        size++;
    }

    // Dequeue (Delete)
    void dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            return;
        }
        // Shift elements
        for (int i = 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
    }

    // Get Front
    int getFront() {
        if (size == 0) return -1;
        return arr[0];
    }

    // Get Rear
    int getRear() {
        if (size == 0) return -1;
        return arr[size - 1];
    }

    // Check Empty
    boolean isEmpty() {
        return size == 0;
    }

    // Check Full
    boolean isFull() {
        return size == capacity;
    }
}
    

   