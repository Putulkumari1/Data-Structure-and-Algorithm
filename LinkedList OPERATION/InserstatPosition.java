class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
//=======================================================================================
public class InserstatPosition {
    Node head;
    // insertion at specific position
    public void insertAtPosition(int data, int position){
        Node newNode = new Node(data); // create new node
        if(position == 0){ // if position is 0, insert at beginning
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for(int i = 0; i < position - 1; i++){ // traverse to the position
            if(temp == null){
                System.out.println("Position out of bounds");
                return;
            }
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = temp.next; // point new node to next node
        temp.next = newNode; // point previous node to new node
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
    InserstatPosition list = new InserstatPosition();
    list.insertAtPosition(5, 0);
    list.insertAtPosition(15, 1); // insert 15 at position 1
    list.insertAtPosition(20, 2); // insert 20 at position 2
    list.insertAtPosition(30, 3); // insert 30 at position 3
    System.out.println("Linked List after insertion at specific positions:");
    list.display();

}
}