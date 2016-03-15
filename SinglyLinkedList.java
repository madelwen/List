      /*
          THIS CODE IS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
          CODE WRITTEN BY OTHER STUDENTS. Maddie Wen
      */

public class SinglyLinkedList {
   
    private Node first = null, last = null;

    public void insert(String item) {
	Node oldfirst = null;
	if (first != null) {
	    oldfirst = first;
	    first = new Node();
	    first.item = item;
	    first.next = oldfirst;
	}
	else {
	    first = new Node();
	    first.item = item; 
	    last = first;
	    last.next = null; 
	}
    }

    public void delete(String item) {
	Node previous = null;
	for (Node current = first; current != null; current = current.next) {
	    if (current.item.equals(item)) {
		if (current == first) {
		    first = first.next; 
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

	while (after != null) {
	    current.next = previous;
	    previous = current;
	    current = after;
	    after = after.next;

	}
	current.next = previous;
	first.next = null;
	Node oldLast = last;
	last = first;
	first = oldLast;

    }

    public String toString() {
	String toReturn = "";
	Node x = new Node();
	System.out.println(first);
	for (x = first; x != null; x = x.next) {
	    toReturn += x.toString() + " -> ";

	}
	toReturn += "null";

	return toReturn;
    }

    public Node getFirst() {
	return first;

    }




    public static void main(String[] args) {
	SinglyLinkedList s = new SinglyLinkedList();
	s.insert("a");
	s.insert("b");
	s.insert("c");
	s.insert("d");
	s.insert("e");
	s.insert("f");
	System.out.println(s);
	s.reverse();
	System.out.println(s);
	s.delete("a");
	System.out.println(s);

    }

}
