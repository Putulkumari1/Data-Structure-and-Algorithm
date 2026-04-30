class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class UpdateLinkedlist {
    Node head;
    //insert at end (for testing)
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
    //update by value
    public void updateByValue(int oldValue, int newValue){
        Node temp = head;
        while(temp != null){
            if(temp.data == oldValue){
                temp.data = newValue;
                System.out.println("update sucessfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("value not found");
    }

//display 
public void display(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + "->");
        temp = temp.next;
    }
    System.out.println("null");
}
public static void main(String[] args) {
    UpdateLinkedlist list = new UpdateLinkedlist();
    list.insert(10);
    list.insert(20);
    list.insert(30);
    list.insert(40);
    list.insert(50);
System.out.println("before update");
list.display();

list.updateByValue(20, 98);
System.out.println("after update");
list.display();


}



}
