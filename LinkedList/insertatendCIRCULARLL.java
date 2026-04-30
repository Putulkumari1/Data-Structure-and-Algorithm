class Node{
    int value;
    Node next;

    //create constructor 
    Node(int value){
        this.value = value;
    }
}
public class insertatendCIRCULARLL {
    Node head;
    public void insertAtEnd(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            head.next = head; // Point to itself to make it circular
            return;
        }
        Node current = head;
        while(current.next != head){ // Loop until we reach the last node
            current = current.next;
        }
        current.next = newNode; // Point the last node to the new node
        newNode.next = head; // Point the new node back to the head
    }
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.value + " ");
            current = current.next;
        } while(current != head); // Loop until we come back to the head
        System.out.println();
    }
   public static void main(String[] args) {
        insertatendCIRCULARLL list = new insertatendCIRCULARLL();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        
        System.out.println("Circular Linked List after inserting at the end:");
        list.printList();
   }

}
