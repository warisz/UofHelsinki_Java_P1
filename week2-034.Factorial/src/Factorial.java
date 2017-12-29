import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int upperBound = reader.nextInt();
        
        int sum = 1;
        for(int i=1; i<=upperBound; i++){
            sum*=i;
        }
        System.out.println("Factorial is " + sum);
    }
}
