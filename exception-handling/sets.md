A Set is a collection that cannot contain duplicate elements. One implementation of the Set is the HashSet class.

import java.util.HashSet;

public class MyClass {
    public static void main(String[ ] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);
    }
}
  
  #=> [A, B, C]
  
## LinkedHashSet
  
  The HashSet class doesn't automatically keep the same order of elements as they are added. To order the elements, use a LinkedHashSet, which maintains the order of elements in which they were inserted.
  
  # What is hashing?
a hash table stores info by hashing, in which a key's informational content is used to determine a unique value called a hash code. So basically, each element in a HashSet is associated with its own unique hash code.
