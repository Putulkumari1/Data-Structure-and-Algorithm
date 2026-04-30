class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class DeleteLinkedlist {
    Node head;
    // 🔹 Delete at Beginning
    public void deleteAtBeginning(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
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
    public static void main(String[] args) {
        DeleteLinkedlist list = new DeleteLinkedlist();

        // Creating a linked list 10 -> 20 -> 30
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);

        System.out.println("Original List:");
        list.display();

        // Deleting the first node
        list.deleteAtBeginning();
        System.out.println("After deleting at beginning:");
        list.display();
}
}