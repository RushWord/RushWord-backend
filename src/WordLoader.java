import java.io.*;
import java.util.*;

public class WordLoader {
    public static List<String> loadWordsFromFile(String fileName) {
        List<String> words = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("src\\dictionaries\\"+fileName))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return words;
    }
}
