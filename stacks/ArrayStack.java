package stacks;
import java.util.ArrayList;
import utils.StackADT;
import utils.EmptyCollectionException;

// implementation of a stack using Java's built in arraylist

public class ArrayStack<T> implements StackADT<T> {

    private static final int DEFAULT_CAPACITY = 100;
    private ArrayList<T> stack;
    private int top;
    
    public ArrayStack(int initialCapacity){
        stack = new ArrayList<T>(initialCapacity);
        top = 0;
    }

    public ArrayStack(){
        this(DEFAULT_CAPACITY);
    }

    // adds an element to the stack (top)
    public void push(T element){
        stack.add(top, element);
        top++;
    }

    // removes an element from the stack (top)
    public T pop() throws EmptyCollectionException {
        if(top > 0){
            top--;
            return stack.remove(top);
        } 
        else throw new EmptyCollectionException("Stack");
    }

    // shows top element to the stack
    public T peek() throws EmptyCollectionException {
        if(top > 0){
            return stack.get(top - 1);
        } 
        else throw new EmptyCollectionException("Stack");
    }

    public boolean isEmpty(){
        return top == 0 ? true : false ;
    }

    public int size(){
        return top;
    }

    public String toString(){
        return stack.toString();
    }

}
