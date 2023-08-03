package utils;

// An interface representing a stack abstract data type
public interface StackADT<T> {

    public void push(T element);
    public T pop();
    public T peek();
    public boolean isEmpty();
    public int size();
    public String toString();

}