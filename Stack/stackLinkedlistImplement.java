
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class StackLL {
    Node top;

    // Push
    void push(int x) {
        Node temp = new Node(x);
        temp.next = top;
        top = temp;
    }

    // Pop
    int pop() {
        if (top == null) {
            System.out.println("Underflow");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    // Peek
    int peek() {
        if (top == null) return -1;
        return top.data;
    }

    // isEmpty
    boolean isEmpty() {
        return top == null;
    }
}

// ✅ Main class (entry point)
public class stackLinkedlistImplement {
    public static void main(String[] args) {

        StackLL st = new StackLL();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Pop: " + st.pop());
        System.out.println("Top: " + st.peek());
        System.out.println("Is Empty: " + st.isEmpty());
    }
}


    

