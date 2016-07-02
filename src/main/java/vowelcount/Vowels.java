package vowelcount;

import java.util.ArrayList;
import java.util.List;

public class Vowels {
    static List<Character> vowels;

    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] inputString = str.toCharArray();
        determineVowels();

        for (char character : inputString) {
            vowelsCount = incrementIfVowel(vowelsCount, character);
        }

        return vowelsCount;
    }

    private static void determineVowels() {
        vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
    }

    private static int incrementIfVowel(int vowelsCount, char character) {
        for (char vowel : vowels) {
            if (character == vowel) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

}