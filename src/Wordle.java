import java.util.Scanner;
import java.util.List;

public class Wordle {
    public static void main(String[] args) {
        System.out.println("Welcome to Wordle");
        Scanner input = new Scanner(System.in);
        System.out.println("Choose language\n1 English\n2 Spanish");
        String language = "";
    while(!language.equalsIgnoreCase("English") && !language.equalsIgnoreCase("Spanish")){

        language = input.nextLine();
        if(!language.equalsIgnoreCase("English") && !language.equalsIgnoreCase("Spanish")){
            System.out.println("Invalid input");
        }
    }



        List<String> words = WordLoader.loadWordsFromFile(language +".txt");

        WordGuessGame myGame = new WordGuessGame(words.toArray(new String[0]));
        System.out.println("(Debug) Word to guess: " + myGame.chosenWord); //  << Just for test
        while (true) {
            try{
                 String userGuess = input.nextLine().trim();

                List<String> result = myGame.userGuess(userGuess);
                System.out.println(result);
                 if (!result.contains("red")) {
                     System.out.println("Correct");
                     break;
                 } else {
                     System.out.println("try again");

                 }


            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
