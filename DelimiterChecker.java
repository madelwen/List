      /*
          THIS CODE IS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
          CODE WRITTEN BY OTHER STUDENTS. Maddie Wen
      */
import java.util.ArrayList;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class DelimiterChecker {

    public static boolean matchPairDelimiter(Character a, Character b) {

	if (a.equals(']') && b.equals('['))
	    return true;
	else if (a.equals(')') && b.equals('('))
	    return true;
	else if (a.equals('}') && b.equals('{'))
	    return true;
	else if (a.equals('>') && b.equals('<'))
	    return true;
	else
	    return false;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {


	//read in text file
        FileReader fr = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(fr);

	String input = null;
	String text = null;
	while ( (input = br.readLine()) != null) {
   	    text += input;
	}

	SimpleStack s = new SimpleStack(); 

	//traversing String & checking for delimiter matches
	for (int i = 0; i < text.length(); i ++) {
	    char indexChar = text.charAt(i);
	    //System.out.println("Working on: " + indexChar);
	    //System.out.println("Top of stack is: " + s.peek());
	    if (indexChar == '{' || indexChar == '[' || indexChar == '(' || indexChar == '<') {
		//System.out.println("Pushing: " + indexChar);
		s.push(indexChar);
	    }
	    else if (indexChar == '}' || indexChar == ']' || indexChar == ')' || indexChar == '>') {
		//System.out.println("Closing char is: " + indexChar);
		//System.out.println("Top of stack is: " + s.peek());
		if (s.stackArray.isEmpty() || !matchPairDelimiter(indexChar, (Character) s.peek())) {
		    System.out.println("Closing delimiter " + indexChar + " has no opening delimiter.");
		}
		else if (matchPairDelimiter(indexChar, (Character) s.peek())) {
		    //System.out.println("Popping: " + (Character) s.peek());
		    Object top = s.pop();
		}
	    }
	}

	//end of traversing, check to see if Stack is empty
	if (s.isEmpty()) {
	    System.out.println("Success -- all delimiters balanced.");
	}
	else {
	    Object top = s.pop();
	    System.out.println("Opening delimiter " + top + " has no closing delimiter.");
	}   
    }
}
