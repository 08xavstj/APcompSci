import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Puzzle {
    private String word;
    private final int maxWords = 45403;
    private int l;
    private int amntGuessed = 0;
    private String guesses = "";
    public ArrayList<String> screenWord = new ArrayList<String>();
    ArrayList<String> words;
    
    public Puzzle() {
        
         words = new ArrayList<String>();

        try {
            File file = new File("words.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String tempWord = scanner.next().toUpperCase();
                words.add(tempWord);
            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        word = words.get((int)(Math.random()*words.size()));
        
        
        l = word.length();
        for (int i = 0; i < l; i++) {
            screenWord.add("_ ");
        }
    }

    public void show() {
        for (int i = 0; i < screenWord.size(); i++) {
            System.out.print(screenWord.get(i));
        }

        System.out.print("");
        System.out.print("Guesses: ");
        System.out.print(guesses+ "\n");
        System.out.println("Guess?");
    }

    public static void main(String[] args) {

    }

    public Boolean isUnsolved() {
        if (amntGuessed < l) return true;
        return false;
    }  

    public Boolean makeGuess(String letter) {
        guesses = (guesses + letter + " ");
        boolean working = false;
        for (int i = 0; i < l; i++) {             
            if (letter.equals(word.substring(i, i+1))) {
                working = true;
                screenWord.set(i, (letter + " "));
                amntGuessed++;
            } 
        }
        return working;
    }

    public String getWord() {
        return word;
    }
}
