
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the points [0-60]: ");
        int points = reader.nextInt();
        
        if(points <= 29){
            System.out.println("\nGrade: failed");
        }else if(points <= 34){
            System.out.println("\nGrade: 1");
        }else if(points <=39){
            System.out.println("\nGrade: 2");
        }else if(points<=44){
            System.out.println("\nGrade: 3");
        }else if (points<=49){
            System.out.println("\nGrade: 4");
        }else if (points<=60){
            System.out.println("\nGrade: 5");
        }
    }
}
