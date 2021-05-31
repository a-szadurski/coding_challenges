package bracket_matcher;

import java.util.Scanner;

class Main {

    public static String BracketMatcher(String str) {
        // code goes here
        str = str.replaceAll("\\s+","");
        char[] strToCharArr = str.toCharArray();

        int leftBrackets = 0;
        int rightBrackets = 0;

        for (char elem : strToCharArr){
            if(elem == '('){
                leftBrackets++;
            } else if(elem == ')'){
                rightBrackets++;
                if(rightBrackets > leftBrackets){
                    return "0";
                }
            }
        }

        if(leftBrackets == rightBrackets){
            return "1";
        }
        return "0";
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(BracketMatcher(s.nextLine()));
    }

}
