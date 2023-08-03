package queues;
import java.util.LinkedList;
import utils.QueueADT;
import utils.EmptyCollectionException;

// implementation of a queue using Java's built in linkedlist

public class LinkedQueue<T> implements QueueADT<T> {

    private int tail, count;
    LinkedList<T> queue;

    public LinkedQueue(){
        tail = count = 0;
        queue = new LinkedList<>();
    }

    // adds an element to the queue (rear)
    public void enqueue(T element){
        queue.add(tail, element);
        tail++;
        count++;
    }

    // removes an element from the queue (front)
    public T dequeue() throws EmptyCollectionException {
        if(count == 0){
            throw new EmptyCollectionException("Queue");
        }
        T removed = queue.remove(0);
        tail--;
        count--;
        return removed;
    }

    public boolean isEmpty(){
        return count == 0 ? true : false;
    }

    public int size(){
        return count;
    }

    // shows front element on the queue
    public T first() throws EmptyCollectionException {
        if(count > 0){
            return queue.get(0);
        }
        throw new EmptyCollectionException("Queue");
    }

    public String toString(){
        return queue.toString();
    }


}
