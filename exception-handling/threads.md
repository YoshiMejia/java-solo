Java is a multi-threaded programming language, which means that our program can make optimal use of available resources by running two or more components simultaneously, with each component handling a different task.
You can subdivide specific operations within a single application into individual *threads* that all run in parallel. 

## to create a thread

1 way is to Extend the Thread class
  - Inherit from the Thread class, override its run() method, and write the functionality you desire in the run() method. Then you create a new object of your own class and call its *start* method to run the thread.

```
class Loader extends Thread {
    public void run() {
        System.out.println("Hello");
    }
}

class MyClass {
    public static void main(String[ ] args) {
        Loader obj = new Loader();
        obj.start();
    }
}

#=> Hello
```

The 2nd way to create a threat is by implementing the Runnable interface. First implement the run() method, then create a new Thread object and pass the Runnable class to its constructor. You then start the thread by calling the start() method.

```
class Loader implements Runnable {
    public void run() {
        System.out.println("Hello");
    }
}

class MyClass {
    public static void main(String[ ] args) {
        Thread t = new Thread(new Loader());
        t.start();
    }
}
#=> Hello
```

note: Thread.sleep() pauses a Thread for a specified amount of time (calling Thread.sleep(1000); pauses the thread for one second.) Keep in mind that Thread.sleep() throws an InterruptedException, so be sure to surround it with a try/catch block.

