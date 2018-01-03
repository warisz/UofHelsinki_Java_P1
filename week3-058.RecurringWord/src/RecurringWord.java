
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
        
        String word = "";
        
        while(!words.contains(word)){
            words.add(word);
            System.out.print("Type a word: ");
            word = reader.nextLine();
            
        }
        System.out.println("You gave the word " + word + " twice");
        }
    }

