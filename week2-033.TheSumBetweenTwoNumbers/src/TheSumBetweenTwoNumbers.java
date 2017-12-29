
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("First: ");
        int lowerBound = reader.nextInt();
        
        System.out.print("Second: ");
        int upperBound = reader.nextInt();
        
        int sum = 0;
        for(int i =lowerBound; i<=upperBound; i++){
            sum+=i;
        }
        System.out.println("\nThe sum is " + sum);
    }
    
}
