class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
//=====================================================================================
public class InsertionAtEnd {
    Node head;
    // insertion at end 
    public void insertAtEnd(int data){
        Node newNode = new Node(data); // create new node
        if(head == null){
            head = newNode; // if list is empty, new node becomes head
            return;
        }
        Node temp = head;
        while(temp.next != null){ // traverse to the end of the list
            temp = temp.next;
        }
        temp.next = newNode; // point last node to new node
    }
    // ========================================================================================
    // display the linked list 
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    //=============================================================================================
public static void main(String[] args) {
    InsertionAtEnd list = new InsertionAtEnd();
    list.insertAtEnd(10);
    list.insertAtEnd(20);
    list.insertAtEnd(30);
    list.insertAtEnd(40);
    System.out.println("Linked List after insertion at end:");
    list.display();
}

}
