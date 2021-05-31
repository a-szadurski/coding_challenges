package letter_changes;

import java.util.Scanner;

class Main {

    public static String LetterChanges(String str) {
        // code goes here

        if(str.length() > 0){
            char first = str.charAt(0);
            if(Character.toLowerCase(first) >= 'a' && Character.toLowerCase(first) <= 'z') {
                if(Character.toLowerCase(first) == 'z'){
                    first = 'A';
                }
                first += 1;
                if(first == 'u' || first == 'o' || first == 'i' || first == 'e'){
                    first = Character.toUpperCase(first);
                }

            }
            return first + LetterChanges(str.substring(1));
        }
        return "";
    }

    public static void main (String[] args) {
        // keep this function call here
        System.out.println(LetterChanges("replace!*"));
//        Scanner s = new Scanner(System.in);
//        System.out.print(LetterChanges(s.nextLine()));
    }

}
