
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int num = reader.nextInt();
        
        if(num%2 == 0 ){
            System.out.println("Number " + num + " is even.");
        }else{
            System.out.println("Number " + num + " is odd.");
        }
    }
}
