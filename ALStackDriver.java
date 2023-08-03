import stacks.ArrayStack;
import utils.EmptyCollectionException;

// driver class for testing the arraylist implementation of a stack
// See test exhibit in the /exhibits folds
public class ALStackDriver {
    public static void main(String[] args){
        ArrayStack<String> ALStack = new ArrayStack<String>(3);

        ALStack.push("aaa");
        ALStack.push("bbb");
        ALStack.push("ccc");
        ALStack.push("ddd");
        
        System.out.println("Added 4 elements top the stack: ");
        System.out.println(ALStack.toString());
        System.out.println("Showing the top element: ");
        System.out.println(ALStack.peek()); // ddd
        System.out.println("Removing the top element: ");
        System.out.println(ALStack.pop()); // ddd
        System.out.println("Size of the stack now: ");
        System.out.println(ALStack.size()); // 3

        System.out.println("Popping 3 times.");
        ALStack.pop();
        ALStack.pop();
        ALStack.pop();

        System.out.println("ALStack should now be empty: " + ALStack.isEmpty()); // true

        try {
            System.out.println("Attempting to pop on empty stack...");
            ALStack.pop();
        } 
        catch(EmptyCollectionException e){
            System.out.println(e.getMessage() + " was empty!");
        }

        ALStack.push("eee");
        ALStack.push("fff");
        ALStack.push("ggg");

        System.out.println("Stack after pushing 3 elements: ");
        System.out.println(ALStack.toString());
    }
}
