// Programmer : Jsako

public class QueueTester {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
       
        System.out.println("Initial Queue, With Size " + queue.size());
        System.out.println(queue);
        System.out.println("_________________________\n\n");
      
        System.out.println("Dequeuing : ");
        while(!queue.isEmpty()) {
            int item = queue.dequeue();
            System.out.println(item + " Dequeued, Remaining Queue : ");
            System.out.println(queue);
            System.out.println("-------------------------\n");
        }
    }

}
