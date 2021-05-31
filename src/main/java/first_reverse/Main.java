package first_reverse;

import java.util.Scanner;

class Main {

    public static String FirstReverse(String str) {
        // code goes here
        StringBuilder solution = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            solution.append(str.charAt(i));

        }
        return solution.toString();
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstReverse(s.nextLine()));
    }

}
