import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int passwordLength;
    private Random random = new Random();
    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.passwordLength = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String password = "";
        while(password.length()<this.passwordLength){
            int num = random.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(num);
            password+=symbol;
        }
        return password;
    }
}
