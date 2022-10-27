//
public class Program {
//The throws statement in the method definition defines the type of Exception(s) the method can throw.
    static int div(int a, int b) throws ArithmeticException {
        if(b == 0) {
            // the throw keyword throws the corresponding exception, along with a custom message.
            throw new ArithmeticException("Division by Zero");
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        System.out.println(div(42, 0));
        // returns: Exception in thread "main" java.lang.ArithmeticException: Division by Zero
        // at Program.div(Program.java:6)
        // at Program.main(Program.java:13)
    }

}