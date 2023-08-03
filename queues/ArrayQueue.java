package queues;
import java.util.ArrayList;
import utils.QueueADT;
import utils.EmptyCollectionException;

// implementation of a queue using Java's built in arraylist

public class ArrayQueue<T> implements QueueADT<T> {

    private static final int DEFAULT_CAPACITY = 100;
    private int rear, count;
    ArrayList<T> queue;

    public ArrayQueue(int initialCapacity){
        rear = count = 0;
        queue = new ArrayList<>(initialCapacity);
    }

    public ArrayQueue(){
        this(DEFAULT_CAPACITY);
    }

    // adds an element to the queue (rear)
    public void enqueue(T element){
        queue.add(rear, element);
        rear++;
        count++;
    }

    // removes an element from the queue (front)
    public T dequeue() throws EmptyCollectionException {
        if(count == 0){
            throw new EmptyCollectionException("Queue");
        }
        T removed = queue.remove(0);
        rear--;
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
