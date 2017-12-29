
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while(true){
            System.out.print("Enter double: ");
            double temp = reader.nextDouble();
            if(!(temp<-30) && !(temp> 40)){
                Graph.addNumber(temp);  
        }
        }
        // Graph is used as follows:
       
        // Remove or comment out these lines above before trying to run the tests.
    }
}
