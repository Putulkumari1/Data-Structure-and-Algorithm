class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SearchingAtPosition {
    Node head;

    // Search element at given position (1-based)
    public int searchAtPosition(int position) {
        Node temp = head;
        int currentPosition = 1;

        while (temp != null) {
            if (currentPosition == position) {
                return temp.data; // found
            }
            temp = temp.next;
            currentPosition++;
        }

        return -1; // position not found
    }

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void main(String[] args) {
        SearchingAtPosition list = new SearchingAtPosition();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        int position = 2;

        int result = list.searchAtPosition(position);

        if (result != -1) {
            System.out.println("Element at position " + position + ": " + result);
        } else {
            System.out.println("Position not found");
        }
    }
}