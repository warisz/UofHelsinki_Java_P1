
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int first = reader.nextInt();
        
        System.out.print("Second: ");
        int second = reader.nextInt();
        
        for(int i=first;i<=second;i++){
            System.out.println(i);
        }
    }
}
