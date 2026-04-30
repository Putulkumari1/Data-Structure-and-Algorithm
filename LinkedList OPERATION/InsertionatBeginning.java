//syntax for linkedlist start
class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;

    }
}

public class InsertionatBeginning {
    Node head;
    //insertion at beginning
    public void insertAtBeginning(int data){
        Node newNode = new Node(data); // create new node
         newNode .next = head;  // point to current head
         head = newNode;   //update head
        }
//display the linked list
        public void  display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");

        }
        public static void main(String[] args) {
            InsertionatBeginning list = new InsertionatBeginning();
            list.insertAtBeginning(10);
            list.insertAtBeginning(20);
            list.insertAtBeginning(30);
            System.out.println("Linked List after insertion at beginning:");

            list.display();
        }
}