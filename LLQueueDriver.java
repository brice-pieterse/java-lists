import queues.LinkedQueue;
import utils.EmptyCollectionException;

// driver class for testing the linkedlist implementation of a queue
// See test exhibit in the /exhibits folds
public class LLQueueDriver {
    public static void main(String[] args){
        LinkedQueue<String> LLQueue = new LinkedQueue<String>();

        LLQueue.enqueue("aaa");
        LLQueue.enqueue("bbb");
        LLQueue.enqueue("ccc");
        LLQueue.enqueue("ddd");

        System.out.println("Enqueued 4 elements: ");
        System.out.println(LLQueue.toString());
        System.out.println("Dequeuing one: ");
        System.out.println(LLQueue.dequeue()); // aaa
        System.out.println("Showing the next first: ");
        System.out.println(LLQueue.first()); // bbb
        System.out.println("Remaining elements: ");
        System.out.println(LLQueue.size()); // 3

        System.out.println("Dequeuing the remaining elements...");
        System.out.println(LLQueue.dequeue()); // bbb
        System.out.println(LLQueue.dequeue()); // ccc
        System.out.println(LLQueue.dequeue()); // ddd
        System.out.println("LLQueue should be empty: " + LLQueue.isEmpty()); // true

        try {
            System.out.println("Attemping dequeue on empty queue...");
            LLQueue.dequeue();
        } catch(EmptyCollectionException e){
            System.out.println(e.getMessage() + " was empty!");
        }

        LLQueue.enqueue("eee");
        LLQueue.enqueue("fff");
        LLQueue.enqueue("ggg");
        LLQueue.enqueue("hhh");

        System.out.println("Enqueued 4 more elements: ");
        System.out.println(LLQueue.toString());
    }
}

