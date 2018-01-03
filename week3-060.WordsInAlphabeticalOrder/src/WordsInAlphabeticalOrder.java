
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        
        String word = "x";
        while(!word.isEmpty()){
            System.out.print("Type a word: ");
            word = reader.nextLine();
            words.add(word);
        }
        System.out.println("You typed the following words:");
        Collections.sort(words);
        for(String i : words){
            System.out.println(i);
        }
    }
}
