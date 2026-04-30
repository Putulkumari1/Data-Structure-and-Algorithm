class Node{
    int value;
    Node next;
    Node prev;

    //create constructor 
    Node(int value){
        this.value = value;
    }
}

public class InsertDOUBLELLatend {
    Node head;
    public void insertAtEnd(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current; // Set the previous pointer of the new node
    }
    public void printList(){
        Node current = head;
        while(current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        InsertDOUBLELLatend list = new InsertDOUBLELLatend();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        
        System.out.println("Doubly Linked List after inserting at the end:");
        list.printList();
    }
}
