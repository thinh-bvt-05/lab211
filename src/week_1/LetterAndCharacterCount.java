package week_1;

import java.util.HashMap;
import java.util.StringTokenizer;

public class LetterAndCharacterCount {

    private String input;

    public LetterAndCharacterCount(String input) {
        this.input = input;
    }

    HashMap<String, Integer> words = new HashMap<>();
    HashMap<Character, Integer> character = new HashMap<>();

    HashMap<String, Integer> countWord() {
        StringTokenizer tokenizer = new StringTokenizer(input);
       //edit
       
       while(tokenizer.hasMoreTokens()){
           String word = tokenizer.nextToken();
           words.put(word, words.getOrDefault(word, 0)+1);
       }
       return words;
     
    }

    HashMap<Character, Integer> countCharacter() {
        for (char n : input.toCharArray()) {
            if (Character.isLetter(n)) {
                character.put(n, character.getOrDefault(n, 0) + 1);
            }
        }
        return character;
    }

    
}
