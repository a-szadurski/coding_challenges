package palindrome;

public class Main {
    public static String PalindromeTwo(String str) {
        // code goes here
        str = str.replaceAll("[^A-Za-z]", "").toLowerCase();
        for(int i = 0; i<str.length();i++){
            if(!(str.charAt(i) == str.charAt(str.length()-1-i))){
                return "false";
            }
        }
        return "true";
    }
}
