import java.util.Scanner;
import java.util.List;

public class Wordle {
    public static void main(String[] args) {
        System.out.println("Welcome to Wordle");

        List<String> words = WordLoader.loadWordsFromFile("dictionary.txt");

        WordGuessGame myGame = new WordGuessGame(words.toArray(new String[0]));
        Scanner input = new Scanner(System.in);
        System.out.println(myGame.chosenWord); //  << Just for test

        while (true) {
            String userGuess = input.nextLine();
            if (myGame.userGuess(userGuess)) {
                System.out.println("Correct");
                break;
            } else {
                System.out.println("It's not correct");
            }
        }
    }
}
