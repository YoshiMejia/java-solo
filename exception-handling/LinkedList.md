The LinkedList is similar syntactically to the ArrayList. 

Note: You cannot specify an initial capacity for a LinkedList.

syntax:

Create a LinkedList that prints "Hey"

LinkedList<String> list = new LinkedList<String>();
list.add("Hey");
System.out.println(list.get(0)); // remember .get() retreives items by its index
  
ArrayLists are better for storing and accessing data, bc it's similar to a normal array. On the other hand, LinkedLists are better for manipulating data (such as making a lot of inserts and deletes)
  
In addition to storing the object, the LinkedList stores the memory address (aka link) of the element that follows it. The name LinkedList is also bc each element contains a link to its neighboring element.
  
Rule of thumb: Use ArrayList for rapid access to data. Use LinkedLists for making many inserts/deletes

example: using the enhanced for loop to iterate over the LinkedList elements:
  
  import java.util.LinkedList;

public class MyClass {
    public static void main(String[ ] args) {
        LinkedList<String> c = new LinkedList<String>();
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.add("Orange");
        c.remove("Green");
        
        for(String s: c) {
            System.out.println(s);
        }
    }
}
