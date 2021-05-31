package username_validation01;

import java.util.Scanner;

class Main {

    public static String UsernameValidation(String str) {
        // code goes here
        return str.matches("[a-zA-Z][a-zA-Z0-9_]{2,23}[^_]") ? "true" : "false";
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(UsernameValidation(s.nextLine()));
    }

}
