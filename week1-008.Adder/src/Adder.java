
import java.util.Scanner;

public class Adder {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int b = Integer.parseInt(reader.nextLine());
        
        System.out.println("\nSum of the numbers: " + (a+b));
    }
}
