class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class deleteatpostion {
    Node head;
    // delete at position
    public void deleteAtPosition(int position){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(position == 1){
            head = head.next;
            return;
        }
        Node temp = head;
        for(int i = 1; i < position - 1 && temp != null; i++){
            temp = temp.next;
        }
        if(temp == null || temp.next == null){
            System.out.println("Invalid position");
            return;
        }
        temp.next = temp.next.next;
    }
    // display the linked list
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    //main method
    public static void main(String[] args) {
        deleteatpostion list = new deleteatpostion();

        // Creating a linked list 10 -> 20 -> 30
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);

        System.out.println("Original List:");
        list.display();

        // Deleting node at position 2
        list.deleteAtPosition(2);
        System.out.println("After deleting at position 2:");
        list.display();
    }
}
