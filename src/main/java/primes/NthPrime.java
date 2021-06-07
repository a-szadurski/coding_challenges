package primes;

public class NthPrime {


    public static int PrimeMover(int num) {
        // code goes here
        int n = 0;
        for (int i = 2; i <= Math.pow(10, 4); i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (!check) {
                continue;
            }
            if (++n == num) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(PrimeMover(9));
    }
}
