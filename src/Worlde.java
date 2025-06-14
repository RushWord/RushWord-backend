import java.util.Random;
import java.util.Scanner;
import java.util.Random;
public class Wordle {
    public static void main(String[] args){
        System.out.println("Welcome to worlde");
        String[] words = {"Hello", "World", "Japan", "Food", "Teen","Men", "Normal", "Nothing", "Java", "Coding", "Last"};
        Random rand = new Random();
        int randomIndex = rand.nextInt(words.length);
        String choosenWord = words[randomIndex];
        Scanner sc = new Scanner(System.in);



        while(true){
        String userGuess = sc.nextLine();
        if(userGuess.equalsIgnoreCase(choosenWord)){
            System.out.println("coreect");
        break;
        }
        else{
            System.out.println("Its not correct" + choosenWord);
        }
        }
        System.out.println("I did choose the first on");


    }
}
