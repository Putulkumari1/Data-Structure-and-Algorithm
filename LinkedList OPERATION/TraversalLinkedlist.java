class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class TraversalLinkedlist {
    Node head;
    // traversal of linked list
    public void traverse(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
}
    //main method
    public static void main(String[] args) {
        TraversalLinkedlist list = new TraversalLinkedlist();

        // Creating a linked list 10 -> 20 -> 30
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);

        System.out.println("Traversal of linked list:");
        list.traverse();
    }
}
