For manipulating data in different collection types, the Java API provides a Collections class. One of the most popular Collections methods is sort() which sorts the collections elements. The methods in the Collections class are static, so you don't need a Collections object to call those methods.

import java.util.ArrayList;
import java.util.Collections;

public class MyClass {
    public static void main(String[ ] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("tiger");
        animals.add("cat");
        animals.add("snake");
        animals.add("dog");
        
        Collections.sort(animals);
       
        System.out.println(animals);
    }
}
  #=> [cat, dog, snake, tiger]
  
You can call the sort() method on different types of Lists.

Other useful methods in the Collections class:
Collections.max(c): Returns the maximum element in c as determined by natural ordering.
Collections.min(nums): Returns the minimum element in c as determined by natural ordering.
Collections.reverse(list): Reverses the sequence in list.
Collections.shuffle(list): Shuffles (i.e., randomizes) the elements in list.
 
