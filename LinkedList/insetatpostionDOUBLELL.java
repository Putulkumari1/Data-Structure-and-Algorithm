class Node{
    int value;
    Node next;
    Node prev;

    //create constructor 
    Node(int value){
        this.value = value;
    }
}

public class insetatpostionDOUBLELL {
    Node head;
    public void insertAtPosition(int value, int position){
        Node newNode = new Node(value);
        if(position == 1){
            newNode.next = head;
            if(head != null){
                head.prev = newNode; // Set the previous pointer of the old head
            }
            head = newNode;
            return;
        }
        Node current = head;
        for(int i = 1; i < position - 1 && current != null; i++){
            current = current.next;
        }
        if(current == null){
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = current.next;
        if(current.next != null){
            current.next.prev = newNode; // Set the previous pointer of the next node
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
        insetatpostionDOUBLELL list = new insetatpostionDOUBLELL();
        list.insertAtPosition(10, 1); // Insert at position 1
        list.insertAtPosition(20, 2); // Insert at position 2
        list.insertAtPosition(30, 3); // Insert at position 3
        list.insertAtPosition(25, 2); // Insert at position 2
        
        System.out.println("Doubly Linked List after inserting at specific positions:");
        list.printList();
    }
}
