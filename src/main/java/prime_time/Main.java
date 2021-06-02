package prime_time;

public class Main {
    public static String PrimeTime(int num) {
        // code goes here
        if (num <= 2) {
            return "true";
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return "false";
            }
        }
        return "true";
    }
}
