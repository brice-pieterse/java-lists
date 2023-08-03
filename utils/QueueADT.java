package utils;

// An interface representing a queue abstract data type
public interface QueueADT<T> {

    public void enqueue(T element);
    public T dequeue();
    public T first();
    public boolean isEmpty();
    public int size();
    public String toString();

}
