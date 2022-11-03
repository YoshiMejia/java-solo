java.io package includes a File class that allows you to work with files.
To start, create a File object and specify the file path in the constructor.

import java.io.File;
...
File file = new File("C:\\data\\input-file.txt");

you can determine if a file exists by using the exists() method

import java.io.File;

public class MyClass {
  public static void main(String[ ] args) {
    File x = new File("C:\\sololearn\\test.txt");
    if(x.exists()) {
     System.out.println(x.getName() +  "exists!");
    }
    else { 
     System.out.println("The file does not exist");
    }
  }
}
NOTE: The getName() method returns the name of the file.
Notice that we used double backslashes in the path, as one backslash should be escaped in the path String.

## Reading a file
There are many different ways of reading from files. One of the easiest is to use the Scammer class from java.util
The constructor of Scanner can take a File obj as input. To read the contents of a text file, we'd need to create the File obj w the corresponding path to pass it to the Scanner obj.

try {
  File x = new File("C:\\sololearn\\test.txt");
  Scanner sc = new Scanner(x);      
}
 catch (FileNotFoundException e) {

}
NOTE: We added the code to a try/catch block in case the file doesn't exist.

Scanner inherits from the Iterator class, so it behaves like one. We can use next() on the Scanner obj to read the file's contents.

try {
  File x = new File("C:\\sololearn\\test.txt");
  Scanner sc = new Scanner(x);
  while(sc.hasNext()) {
    System.out.println(sc.next());
  }
  sc.close();
} catch (FileNotFoundException e) {
  System.out.println("Error");
}

The contents are output word by word bc next() returns each word separately. (NOTE: It is always good practice to close a file when finished working with it. One way to do this is to use the Scanner's close() method.)

## Creating files

the Formatter class is used to create content and write it to files. 

import java.util.Formatter;

public class MyClass {
   public static void main(String[ ] args) {
  try {
    Formatter f = new Formatter("C:\\sololearn\\test.txt");
  } catch (Exception e) {
      System.out.println("Error");
  }
  }
}

This creates an empty file at the specified path, but if the file already exists it will be overwritten. 

## Writing to Files

Once the file is created you can write content in it using the Formatter class's format() method

import java.io.File;
import java.util.Scanner;
import java.util.Formatter;

public class MyClass {
    public static void main(String[ ] args) {
        try {
            Formatter f = new Formatter("test.txt");
            f.format("%s %s %s", "1","John", "Smith \r\n");
            f.format("%s %s %s", "2","Amy", "Brown");
            f.close();

            File x = new File("test.txt");
            Scanner sc = new Scanner(x);
            while(sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (Exception e) {
        System.out.println("Error");
        }
    }
}
#=>1
John
Smith
2
Amy
Brown

The format() method formats its parameters according to the first param. %s means a string and gets replaced by the first param after the format. The second %s get's replaced by the next one, and so on. So, the format %s %s %s denotes three strings that are separated with spaces.
Note: \r\n is the newline symbol in Windows.

The code above creates a file with the following content:
1 John Smith 
2 Amy Brown
