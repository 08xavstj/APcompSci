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

    public Boolean makeGuess(String guess) {
        if (guess == word) {
            return true;
        } else {
            return false;
        }
    }

    public String getWord() {
        return word;
    }
}
