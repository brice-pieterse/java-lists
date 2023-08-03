import queues.ArrayQueue;
import utils.EmptyCollectionException;

// driver class for testing the arraylist implementation of a queue
// See test exhibit in the /exhibits folds
public class ALQueueDriver {
    public static void main(String[] args){
        ArrayQueue<String> ALQueue = new ArrayQueue<String>();

        ALQueue.enqueue("aaa");
        ALQueue.enqueue("bbb");
        ALQueue.enqueue("ccc");
        ALQueue.enqueue("ddd");

        System.out.println("4 elements were added to start, printing the queue: ");
        System.out.println(ALQueue.toString());
        System.out.println("Dequeing the first: ");
        System.out.println(ALQueue.dequeue()); // aaa
        System.out.println("New first: ");
        System.out.println(ALQueue.first()); // bbb
        System.out.println("New size: ");
        System.out.println(ALQueue.size()); // 3

        
        System.out.println("Dequeing 3 more: ");
        System.out.println(ALQueue.dequeue()); // bbb
        System.out.println(ALQueue.dequeue()); // ccc
        System.out.println(ALQueue.dequeue()); // ddd

        System.out.println("ALQueue should be empty: " + ALQueue.isEmpty()); // true

        try {
            System.out.println("Attempting to dequeue on empty queue: ");
            ALQueue.dequeue();
        } 
        catch(EmptyCollectionException e){
            System.out.println(e.getMessage() + " was empty!");
        }

        ALQueue.enqueue("eee");
        ALQueue.enqueue("fff");
        ALQueue.enqueue("ggg");
        ALQueue.enqueue("hhh");

        System.out.println("4 elements were just added, printing the queue: ");
        System.out.println(ALQueue.toString());
    }
}
