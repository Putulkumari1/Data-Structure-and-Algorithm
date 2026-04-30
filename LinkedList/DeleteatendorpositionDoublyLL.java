class Node{
    int value;
    Node next;
    Node prev;

    //create constructor 
    Node(int value){
        this.value = value;
    }
}
public class DeleteatendorpositionDoublyLL {
    Node head;
    public void deleteAtPosition(int position){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(position == 1){
            head = head.next;
            if(head != null){
                head.prev = null; // Set the previous pointer of the new head
            }
            return;
        }
        Node current = head;
        for(int i = 1; i < position && current != null; i++){
            current = current.next;
        }
        if(current == null){
            System.out.println("Position out of bounds");
            return;
        }
        if(current.next != null){
            current.next.prev = current.prev; // Set the previous pointer of the next node
        }
        if(current.prev != null){
            current.prev.next = current.next; // Set the next pointer of the previous node
        }
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
        DeleteatendorpositionDoublyLL list = new DeleteatendorpositionDoublyLL();
        list.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);
        
        // Connect the nodes
        list.head.next = second;
        second.prev = list.head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;
        fourth.next = fifth;
        fifth.prev = fourth;
        
        System.out.println("Doubly Linked List before deletion:");
        list.printList();
        
        list.deleteAtPosition(2); // Delete node at position 2 (value 20)
        
        System.out.println("Doubly Linked List after deleting at position 2:");
        list.printList();
    }
}
