      /*
          THIS CODE IS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
          CODE WRITTEN BY OTHER STUDENTS. Maddie Wen
      */
import java.util.ArrayList;

public class SimpleStack implements Stack {

    public ArrayList<Object> stackArray = new ArrayList<Object>(); 
    int next = 0;

    public void push(Object o) {
	
	stackArray.add(0);
	stackArray.set(next, o);
	next += 1;

    }

    public Object pop() {

	if (next == 0) return null;

	Object popObject = stackArray.get(next -1);
	stackArray.set(next -1, 0);
	next -= 1;


	return popObject;

    }

    public Object peek() {
	if (next == 0) return null;
	return (stackArray.get(next-1)); 

    }

    public int size() {
	return stackArray.size();

    }

    public boolean isBuiltOnLinkedList() {
	return false;
    }

    public boolean isBuiltOnArrays() {
	return true; 
    }

    public boolean isEmpty() {
	boolean empty = false;
	if (next == 0) {
	    empty = true;
	}
	return empty;
    }


}
