class Node{
    int value;
    Node next;
    Node prev;

    //create constructor 
    Node(int value){
        this.value = value;
    }
}

public class updateorDisplayDobleLL {
    Node head;
    public void updateValueAtPosition(int value, int position){
        if(head == null){
            System.out.println("List is empty");
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
        current.value = value; // Update the value at the specified position
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
        updateorDisplayDobleLL list = new updateorDisplayDobleLL();
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
        
        System.out.println("Original Doubly Linked List:");
        list.printList();
        
        // Update value at position 3
        list.updateValueAtPosition(35, 3);
        
        System.out.println("Doubly Linked List after updating value at position 3:");
        list.printList();
    }
    
}
