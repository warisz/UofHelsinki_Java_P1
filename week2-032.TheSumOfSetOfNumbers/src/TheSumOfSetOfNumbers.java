
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int until = reader.nextInt();
        
        int sum = 0;
        int currentNum = 1;
        
        while(currentNum<=until){
            sum+=currentNum;
            currentNum++;
        }
        
        System.out.println("Sum is " + sum);
    }
}
