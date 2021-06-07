package letter_changes;

public class CapitalizeLetters {

    public static String LetterCapitalize(String str) {
        // code goes here
        String[] strSplit = str.split("\\s");
        StringBuilder solution = new StringBuilder();
        for (String elem : strSplit) {
            solution.append(Character.toUpperCase(elem.charAt(0))).append(elem.substring(1)).append(" ");
        }

        return solution.deleteCharAt(solution.length() - 1).toString();
    }


}
