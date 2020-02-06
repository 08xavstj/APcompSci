import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Puzzle {
    private String word = "life";
    public Puzzle() {

    }

    public static void show() {

    }

    public static void main(String[] args) {

    }

    public Boolean isUnsolved() {
        return true;
    }  

    public Boolean makeGuess(String letter) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (letter.equals(ch)) {
                return true;
            } 
        }
        return false;
    }

    public String getWord() {
        return word;
    }
}
