class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class deleteatEnd {
    Node head;
    // delete at end
    public void deleteAtEnd(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
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
        deleteatEnd list = new deleteatEnd();

        // Creating a linked list 10 -> 20 -> 30
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);

        System.out.println("Original List:");
        list.display();

        // Deleting the last node
        list.deleteAtEnd();
        System.out.println("After deleting at end:");
        list.display();
    }
}
