public class queueeg {
    public static void main(String[] args) {
        QueueArrayImp q = new QueueArrayImp(3);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.getFront()); // 10

        q.dequeue();

        System.out.println(q.getFront()); // 20
        System.out.println(q.getRear());  // 30
}
}