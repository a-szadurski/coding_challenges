package longest_word;

import java.util.Scanner;

class Main {

    public static String LongestWord(String sen) {
        // code goes here
        String[] preSolved = sen.split("[^\\w]");
        String solved = "";
        for (String elem : preSolved) {
            if (elem.length() > solved.length()) {
                solved = elem;
            }
        }
        return solved;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }

}
