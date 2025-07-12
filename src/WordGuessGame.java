import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordGuessGame {
    public String chosenWord;

    public WordGuessGame(String[] words) {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        this.chosenWord = words[randomIndex];
    }

    public List<String> userGuess(String word) {
        if (word.length() != 5) {
            throw new IllegalArgumentException("Input must be exactly 5 letters");
        }

        List<String> result = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            if (word.charAt(i) == this.chosenWord.charAt(i)) {
                result.add("green");
            } else {
                result.add("red");
            }
        }

        return result;
    }
}
