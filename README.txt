SECTION 1: Identifying Details
i) Name: Madeline Wen
ii) Unix login: mwen2
iii) Emory email: mwen2@emory.edu

--------------------

SECTION 2: Delimiter Matching
i) My method reads in a text file as a string. Then I create a SimpleStack object in order to call the methods used in SimpleStack (push, pop, peek, size, isEmpty). Then I traverse the string (checked character at each position, lines 45-46) and look for delimiter matches. If a character is an opening delimiter of any kind, I push it (push method was implemented by adding that specific character into an object arraylist and incrementing a next counter by one). If a character I reach is a closing delimiter, I look at the SimpleStack stackArray. If it is empty (meaning no opening delimiter was pushed in), that closing delimiter is unmatched and I print a statement saying so. Also, if the character in question does not pair up with the most recently pushed character/the character at the top of the stack (referenced by the peek() method), the closing delimiter is unmatched and a statement saying so is printed. However, if a character matches the most recently pushed character, the pushed character is popped out (by returning it, putting zero in its place in the ArrayList and setting its position to next). All delimiter matches are checked using my matchPairDelimiter method. After traversing the string, if the SimpleStack stackArray is empty (line 67), it means that all delimiters were correctly paired up and a success statement is printed. However, if it is not, the remaining character (which is an opening delimiter) is popped and printed as missing its closing delimiter. 

ii) I created several text files and passed them in as arguments in the main method to test different cases. First, the string in the file was perfectly and evenly balanced: "{(<[]>)}". Then I tested the string that was obviously not balanced: "[()}[]>)". I also tested a variety of strings that were balanced, but not as obvious/evenly as the first test string: "{([]{})<>}". Lastly, I passed in files that had lines of code (ex. Node.java).

iii) No bugs that I know of/could find

iv) Notes I took in class, class slides, midterm

--------------------

SECTION 3: Circular Singly Linked List (also applies to Singly Linked List)
i) Insert: I started with three nodes: first, last and oldfirst. When inserting the string item into the stack, if it was the first item, I created a new node for first and set that item to the first node. The node last also pointed to the same item since it will become the last link in the list (once other items are added in). Then, to make it circular, I made the node next of the last link point to the first node (lines 20-23). If I was inserting a string item and it was not the first item, I made the oldfirst node point to the first node so that I could reuse the node first for the new item. In lines 16 and 17, I set the next nodes so that the list would remain circular with the last node pointing back at the first.

Delete: to delete a string item, I first traversed the linked list (line 29) and would keep tabs on a current and a previous node. If the string to be deleted was in the first node, the last.next node would simply point to the first.next node and the first.next node would become the new first node. If it was found elsewhere in the list, the previous.next node was simply redirected to point to the current.next node (line 36). If the particular string was not found in a particular link, the current node would become the previous node and then the current node would be set to the current.next node. This continued until the whole linked list was searched (until the previous node was the last node).

Reverse: I kept track of a previous, current, and after node and pointed each to the first three links in the list respectively. Then, until I had finished going through the whole list (line 54), I reversed all the nodes by pointing the current.next node to the one before it (previous node). After this, I made sure to direct the first.next node backwards to the last node (to keep the list circular). I then had to make the first node the last node and vise versa (lines 62-64). 

toString: Using my toString() method from my Node class (which returns the item of the node) and a toReturn string, I traversed the linked list and added each node with and arrow following it (line 76). Once I reached the last node, I added it as well along with an arrow pointing to "start." This signifies that the list is circular (last node points back to the start).

ii) I created a main method within the same class and created my own circular singly linked list. I tested each of my methods (insert, reverse, delete, etc.) to make sure they were working correctly as well as added several print statements throughout the code to ensure that certain variables were updating correctly. When testing the delete(String s) method, I tested a variety of cases: string to be deleted was first in the list, string to be deleted was last in the list, string to be deleted was in the middle of the list, and string to be deleted occurred multiple times in the list (in a row & not in a row). I printed the linked list after each method invocation. 

iii) No bugs that I know of/could find

iv) Notes I took in class, class slides
