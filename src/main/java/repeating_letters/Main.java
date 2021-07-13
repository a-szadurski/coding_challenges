package repeating_letters;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class Main {

    public static String LetterCount(String str) {
        // code goes here

        String[] words = str.split("\\s+");
        int maxRepeated = 1;
        String result = "-1";

        for (String word : words) {
            int repeatedCount = countRepeatedLetters(word);
            if (repeatedCount > maxRepeated) {
                maxRepeated = repeatedCount;
                result = word;
            }
        }

        return result;
    }

    public static int countRepeatedLetters(String input) {

        HashMap<Character, Integer> inputMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            inputMap.put(input.charAt(i), inputMap.getOrDefault(input.charAt(i), 0) + 1);
        }

        return Collections.max(inputMap.values());
    }


    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LetterCount(s.nextLine()));
    }

}