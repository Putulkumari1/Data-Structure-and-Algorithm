class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class InsertDisplay {
     Node head;
     // inser at  end of the linked list
     public void insert(int data){
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
     //display the linked list
     public void display(){
        Node temp = head;
        while( temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("null");
     }
     public static void main(String[] args) {
        //insert data and print 
        InsertDisplay list = new InsertDisplay();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.display();
     }
}
