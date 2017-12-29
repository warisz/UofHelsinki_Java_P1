
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String userPassword = "";
        
        
        while(true){
            System.out.print("Type the password: ");
            userPassword = reader.nextLine();
        
            if(password.equals(userPassword)){
                System.out.println("Right!");
                break;
            }else{
                System.out.println("Wrong!");
            }
        }
        System.out.println("");
        
    }
}
