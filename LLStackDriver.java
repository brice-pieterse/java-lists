import stacks.LinkedStack;
import utils.EmptyCollectionException;

// driver class for testing the linkedlist implementation of a stack
// See test exhibit in the /exhibits folds
public class LLStackDriver {
    public static void main(String[] args){
        LinkedStack<String> LLStack = new LinkedStack<String>();

        LLStack.push("aaa");
        LLStack.push("bbb");
        LLStack.push("ccc");
        LLStack.push("ddd");

        System.out.println("Added 4 elements to the stack: ");
        System.out.println(LLStack.toString());
        System.out.println("Showing top element: ");
        System.out.println(LLStack.peek()); // ddd
        System.out.println("Removing top element: ");
        System.out.println(LLStack.pop()); // ddd
        System.out.println("Size of the stack: ");
        System.out.println(LLStack.size()); // 3

        System.out.println("Removing the rest...");
        LLStack.pop();
        LLStack.pop();
        LLStack.pop();

        System.out.println("LLStack should be empty: " + LLStack.isEmpty()); // true

        try {
            System.out.println("Attempting to pop on empty stack..");
            LLStack.pop();
        } 
        catch(EmptyCollectionException e){
            System.out.println(e.getMessage() + " was empty!");
        }

        LLStack.push("eee");
        LLStack.push("fff");
        LLStack.push("ggg");

        System.out.println("Added 3 elements to the stack: ");
        System.out.println(LLStack.toString());
    }
}
