package simple_symbols;

public class Main {

    public static String SimpleSymbols(String str) {
        // code goes here
        if (Character.isLetter(str.charAt(0)) || Character.isLetter(str.charAt(str.length() - 1))) {
            return "false";
        }
        for (int i = 1; i < str.length() - 1; i++) {
            if (Character.isLetter(str.charAt(i))) {
                if (!(str.charAt(i - 1) == '+' && str.charAt(i + 1) == '+')) {
                    return "false";
                }
            }
        }
        return "true";
    }

    public static void main(String[] args) {
        System.out.println(SimpleSymbols("+d===+a+"));
    }

}
