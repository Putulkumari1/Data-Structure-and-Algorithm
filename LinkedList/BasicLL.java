public class BasicLL {
   public static class Node{
    int data;  //value
    Node next;   // address of the next node
    Node(int data){
        this.data = data;
    }
   }
    public static void main(String[] args) {
        Node a = new Node(5); // head node 
        System.out.println(a.next);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        //5-> 3-> 9->8->16
         a.next = b; //5-> 3 9 8 16
        // System.out.println(a.data);
        b.next = c;  // 5-> 3 -> 9  8 16 
        c.next = d;  // 5-> 3-> 9->8 16
        d.next = e;   //5-> 3-> 9->8->16
       System.out.println(a.data);
       System.out.println(b.data);
       System.out.println(c.data);
       System.out.println(d.data);
       System.out.println(e.data);

    }
}
