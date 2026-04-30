class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class SearchingLinkedlist {
    Node head;
    // Search for an element standard
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;  // element found
            }
            temp = temp.next;
        }
        return false; // element not found
    }

    // Insert at end (for testing)
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

    // Main method
    public static void main(String[] args) {
        SearchingLinkedlist list = new SearchingLinkedlist();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        int key = 20;

        if (list.search(key)) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }

}