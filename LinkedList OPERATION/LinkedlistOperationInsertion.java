
    class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedlistOperationInsertion {
    Node head;

    // 🔹 Insert at Beginning
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // 🔹 Insert at End
    public void insertAtEnd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // 🔹 Insert at Position (1-based index)
    public void insertAtPosition(int data, int position){
        Node newNode = new Node(data);

        // insert at beginning
        if(position == 1){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for(int i = 1; i < position - 1 && temp != null; i++){
            temp = temp.next;
        }

        // invalid position
        if(temp == null){
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 🔹 Display
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedlistOperationInsertion list = new LinkedlistOperationInsertion();

        // Insert at beginning
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);

        // Insert at end
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        // Insert at position
        list.insertAtPosition(25, 3);

        System.out.println("Final Linked List:");
        list.display();
    }
}
    
