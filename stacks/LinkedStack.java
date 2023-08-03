package stacks;
import java.util.LinkedList;
import utils.StackADT;
import utils.EmptyCollectionException;

// implementation of a stack using Java's built in linkedlist

public class LinkedStack<T> implements StackADT<T> {
    private LinkedList<T> stack;
    private int top;
    
    public LinkedStack(){
        stack = new LinkedList<T>();
        top = 0;
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


    // shows top element on the stack
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




