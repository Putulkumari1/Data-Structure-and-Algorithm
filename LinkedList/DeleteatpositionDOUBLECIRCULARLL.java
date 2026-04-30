class Node{
    int value;
    Node next;
    Node prev;

    //create constructor 
    Node(int value){
        this.value = value;
    }
}

public class DeleteatpositionDOUBLECIRCULARLL {
   Node head; 
   public void deleteAtPosition(int position){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(position == 1){
            if(head.next == head){ // Only one node in the list
                head = null;
                return;
            }
            Node last = head;
            while(last.next != head){
                last = last.next;
            }
            head = head.next; // Move head to the next node
            last.next = head; // Update last node's next to new head
            head.prev = last; // Update new head's prev to last node
            return;
        }
        Node current = head;
        for(int i = 1; i < position && current.next != head; i++){
            current = current.next;
        }
        if(current.next == head){
            System.out.println("Position out of bounds");
            return;
        }
        current.prev.next = current.next; // Set the next pointer of the previous node
        current.next.prev = current.prev; // Set the previous pointer of the next node
    }
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        do{
            System.out.print(current.value + " ");
            current = current.next;
        } while(current != head);
        System.out.println();
    }
    public static void main(String[] args) {
        DeleteatpositionDOUBLECIRCULARLL list = new DeleteatpositionDOUBLECIRCULARLL();
        
        // Create a circular doubly linked list with some nodes
        list.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        
        list.head.next = second;
        second.prev = list.head;
        
        second.next = third;
        third.prev = second;
        
        third.next = list.head; // Make it circular
        list.head.prev = third; // Make it circular
        
        System.out.println("Circular Doubly Linked List before deletion:");
        list.printList();
        
        list.deleteAtPosition(2); // Delete node at position 2
        
        System.out.println("Circular Doubly Linked List after deletion:");
        list.printList();
    }
}
