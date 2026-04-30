class stackimplement {

    int[] arr;
    int top;
    int capacity;

    stackimplement(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Overflow");
            return;
        }
        arr[++top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        if (top == -1) return -1;
        return arr[top];
    }


    public static void main(String[] args) {

        stackimplement st = new stackimplement(5);

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Pop: " + st.pop());
        System.out.println("Top: " + st.peek());
    }
}