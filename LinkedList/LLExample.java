class Node{
    int value;
    Node next;

    //create constructor 
    Node(int value){
        this.value = value;
    }
}

public class LLExample {
    public static void main(String[] args) {
    
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        
        //connect to linkelist node
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
       System.out.println(a); // print a
       System.out.println(b); // print b addres
       System.out.println(a.next);// print b address and linked previous node
       System.out.println(c);
       System.out.println(b.next);
    

        
    }

}
