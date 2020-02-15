
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

        if (!guessedLetters.contains(letter)) {

            if (!word.contains(letter)) {
                numberOfFaults++;
            }

            guessedLetters += letter;
        }
    }

    public String hiddenWord() {
        String hiddenWord = "";
        String currLetter = "";
        int i = 0;

        while (this.word.length() > i) {
            currLetter = "" + word.charAt(i);
            if (guessedLetters.contains(currLetter)) {
                hiddenWord += currLetter;
            } else {
                hiddenWord += "_";
            }
            i++;
        }

        return hiddenWord;
    }
}
