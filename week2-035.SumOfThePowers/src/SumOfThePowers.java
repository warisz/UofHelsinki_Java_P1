
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int power = reader.nextInt();
        
        int sum = 0;
        for(int i =0; i<=power; i++){
            sum+= Math.pow(2, i);
        }
        System.out.println("The result is " + sum);
    }
}
