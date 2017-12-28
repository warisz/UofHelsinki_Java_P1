
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the radius: ");
        double r = reader.nextDouble();
        
        System.out.println("\nCircumference of the circle: " + (2*Math.PI*r));
        
        // Program your solution here 
    }
}
