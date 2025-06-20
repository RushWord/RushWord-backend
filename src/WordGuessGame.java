import java.util.Random;

public class WordGuessGame {
    public String chosenWord;

    public WordGuessGame(String[] words) {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        this.chosenWord = words[randomIndex];
    }

    public boolean userGuess(String word) {
        return word.equalsIgnoreCase(this.chosenWord);
    }
}
