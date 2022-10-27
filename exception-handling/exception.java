import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
        // choice variable holds user input of their choice
	    int choice = scanner.nextInt();
	    
	    String[] categories = {"PCs", "Notebooks", "Tablets", "Phones", "Аccessories"};
	    
	    try {
            //print out the user choice
	        System.out.println(categories[choice]);
	    } catch(Exception e) {
            // if there's an error, print out error msg
	        System.out.println("Wrong Option");
	    }
	}
}