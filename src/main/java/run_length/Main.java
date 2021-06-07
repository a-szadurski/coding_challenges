package run_length;

public class Main {


    public static String RunLength(String str) {
        // code goes here
        StringBuilder solution = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            int repeated = 1;
            while (i + repeated < str.length() && str.charAt(i + repeated) == str.charAt(i)) {
                repeated++;
            }
            solution.append(repeated).append(str.charAt(i));
            i += repeated;
        }
        return solution.toString();
    }

    public static void main(String[] args) {
        System.out.println(RunLength("aabbccdd"));
    }
}
