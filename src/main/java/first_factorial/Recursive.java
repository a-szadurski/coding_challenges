package first_factorial;

import java.util.Scanner;

class Recursive {

    public static int FirstFactorial(int num) {
        // code goes here
        if (num <= 1) {
            return num;
        }
        return num * FirstFactorial(num - 1);
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(Integer.parseInt(s.nextLine())));
    }

}
