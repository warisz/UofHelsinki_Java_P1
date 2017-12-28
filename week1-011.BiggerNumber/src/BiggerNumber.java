
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int a = reader.nextInt();
        
        System.out.print("Type another number: ");
        int b = reader.nextInt();
        
        System.out.println("\nThe bigger number of the two numbers given was: " + Math.max(a, b));
        
        // Implement your program here. Remember to ask the input from user
    }
}
