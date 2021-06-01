package simple_nums;

public class Main {

    public static String CheckNums(int num1, int num2) {
        // code goes here
        if (num1 > num2) {
            return "false";
        }

        if (num1 == num2) {
            return "-1";
        }
        return "true";

    }
}
