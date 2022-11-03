there are 2 types of exceptions; checked and unchecked (also called runtime exceptions). The main difference is that checked exceptions are checked when compiled, while unchecked exceptions are checked at runtime.

Remember, Thread.sleep() throws an **InterrupedException** error which is an example of a checked exception, the code will not compile until the exception has been handled.

## ArrayList

The Java API provides special classes to store and manipulate groups of objects, one of which is the ArrayList class. Standard Java arrays are created with a fixed length, which means once theyre creatd they cannot change size. On the other hand, ArrayLists are created with an initial size but once that size is exceeded, the collection is automatically enlarged. It also shrinks in size when an element is removed.
Note that the ArrayList class is in the **java.util** package so it needs to be imported before use.
creation syntax:
import java.util.ArrayList;
//.....
ArrayList colors = new ArrayList();

You can optionally specify a capacity and type for the objects the ArrayList will hold:

ArrayList<String> colors = new ArrayList<String>(10);
  This defines an ArrayList of Strings with 10 as its inital size.

Note: ArrayLists store objects and so the specified type must be a class type. This means you cannot pass **int** or **double** but instead pass the special class types for these values (Double and Int etc)
  
## ArrayList class methods
  
add() and remove() add and remove elements respectively to/from the ArrayList
example:

import java.util.ArrayList;
  
  public class MyClass{
    public static void main(String[] args){
      ArrayList<String> colors = new ArrayList<String>();
      colors.add("Red");
      colors.add("Blue");
      colors.add("Green");
      colors.add("Yellow");
      colors.remove("Red");
  
      System.out.println(colors);
    }
  }
  
  
  other useful methods include: 
- contains(): Returns true if the list contains the specified element
- get(int index): Returns the element at the specified position in the list
- size(): Returns the number of elements in the list
- clear(): Removes all of the elements from the list

Note: As with arrays, the indexing starts with 0.
  
  
  
  
  
