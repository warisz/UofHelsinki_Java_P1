
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guessNum = 0;
        while(true){
            System.out.print("Guess a number: ");
            int num = Integer.parseInt(reader.nextLine());
            guessNum++;
            if(num==numberDrawn){
                System.out.println("Congratulations, your guess is correct!");
                break;
            }else if(num<numberDrawn){
                System.out.println("The number is greater, guesses made: " +guessNum);
            }else{
                System.out.println("The number is lesser guesses made: " +guessNum);
            }

        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
