class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class UpdatebyPosition {
    Node head;

    // insert at end
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

    // update by position (0-based index)
    public void updateByPosition(int position, int newValue) {
        Node temp = head;

        for (int i = 0; i < position; i++) {
            if (temp == null) {
                System.out.println("Position out of bounds");
                return;
            }
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        temp.data = newValue;
        System.out.println("Updated successfully");
    }

    // display
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        UpdatebyPosition list = new UpdatebyPosition();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println("Before update:");
        list.display();

        list.updateByPosition(2, 98); // 0-based index

        System.out.println("After update:");
        list.display();
    }
}