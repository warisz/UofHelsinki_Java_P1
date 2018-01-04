
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess
        if(!this.guessedLetters.contains(letter)){
            this.guessedLetters+=letter;
            if (!this.word.contains(letter))
                this.numberOfFaults++;
        }
        
        }
        // if the letter has already been guessed, nothing happens

        // if the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters
    

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        String hiddenWord = "";
        int i = 0;
        while(i<this.word.length()){
            char c = this.word.charAt(i);
            String guessed = "" + c;
            if (this.guessedLetters.contains(guessed)){
                hiddenWord+=c;
            }else{
                hiddenWord+="_";
            }
            i++;
        }
        // return the hidden word at the end
        return hiddenWord;
    }
}
