      /*
          THIS CODE IS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
          CODE WRITTEN BY OTHER STUDENTS. Maddie Wen
      */

public class CircularSinglyLinkedList {
   
    private Node first = null, last = null;

    public void insert(String item) {
	Node oldfirst = null;
	if (first != null) {
	    oldfirst = first;
	    first = new Node();
	    first.item = item;
	    first.next = oldfirst;
	    last.next = first;
	}
	else {
	    first = new Node();
	    first.item = item; 
	    last = first;
	    last.next = first; 
	}
    }

    public void delete(String item) {
	Node previous = null;
	for (Node current = first; previous != last; current = current.next) {
	    if (current.item.equals(item)) {
		if (current == first) {
		    first = first.next; 
		    last.next = first;
		}
		else {
		    previous.next = current.next; 
		}
	    }
	    else {
	    	previous = current;
	    }
	}
    }
  
    public void reverse() {

	Node after = first.next;

	after = after.next;
	Node current = first.next;
	Node previous = first; 
	previous.next = last; 

	while (current != first) {
	    current.next = previous;
	    previous = current;
	    current = after;
	    after = after.next;

	}
	first.next = last;
	Node oldLast = last;
	last = first;
	first = oldLast;

    }

    public String toString() {
	String toReturn = "";
	Node x = new Node();
	System.out.println("first: " + first);
	System.out.println("last: " + last);
	System.out.println("first.next: " + first.next);
	System.out.println("last.next: " + last.next);	
	for (x = first; x.next != first; x = x.next) {
	    toReturn += x.toString() + " -> ";

	}
	toReturn += last.toString() + " -> " + "start";

	return toReturn;
    }

    public Node getFirst() {
	return first;

    }




    public static void main(String[] args) {
	CircularSinglyLinkedList c = new CircularSinglyLinkedList();
	c.insert("a");
	c.insert("b");
	c.insert("c");
	c.insert("d");
	c.insert("e");
	c.insert("e");
	c.insert("e");
	c.insert("e");
	c.insert("f");
	System.out.println(c);
	c.reverse();
	System.out.println(c);
	c.delete("a");
	System.out.println(c);
	Node firstObj = c.getFirst();
	System.out.println(firstObj);

    }

}
