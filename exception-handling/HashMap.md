Arrays and Lists store their elements as an ordered collection, giving each element an index number.

HashMaps are used for storing data collections as key/value pairs. One object is used as a key(index) to another obj(the value).
The put() remove() and get() methods are used to add, delete, and access HashMap values

import java.util.HashMap;

public class MyClass {
    public static void main(String[ ] args) {
        HashMap<String, Integer> points = new HashMap<String, Integer>();
        points.put("Amy", 154);
        points.put("Dave", 42);
        points.put("Rob", 733);
        System.out.println(points.get("Dave")); 
    }
}
#=> 42

note: here we used the get() method with the key value for the desired element, instead of how its used in the previous lesson by the index number of the element.

A HashMap cannot contain duplicate keys. Adding a new item with an existing key will overwrite the previous element's value.
The HashMap class provides containsKeys() and containsValue() methods that determine the presence of a specified key/value. If you try to get a val that isnt present in your HashMap, it returns null.

## HashMap practice problem

HashMap

The program you are given defines and outputs HashMap, where the names of employees are stored as keys, and their ages as values.
It also takes N number from user as age limit. Write code to delete all the employees whom age is less than N number.
The line of code for the output of HashMap object is already provided.

Sample Input
25

Sample Output
{Robert=32, John=28}


import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[ ] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        HashMap<String, Integer> ages = new HashMap<String, Integer>();
        ages.put("David", 22);
        ages.put("Tom", 23);
        ages.put("Robert", 32);
        ages.put("Alice", 21);
        ages.put("Sophie", 19);
        ages.put("Maria", 24);
        ages.put("John", 28);
        
        
        String[] nameArr = new String[ages.size()];
        nameArr = ages.keySet().toArray(nameArr);
        
        int ageLimit = scanner.nextInt();
        
        for (String emp : nameArr){
            //your code goes here
            // get emp age from ages
            // if age is < ageLimit .remove() from ages
           int empAge = ages.get(emp);
           if(empAge < ageLimit){
               ages.remove(emp);
           }
            
        }
        
        System.out.println(ages);
    }
}
