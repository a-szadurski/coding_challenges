package Division;

import java.util.Arrays;

public class MaxCommonDivisor {
    public static int Division(int num1, int num2) {
        // code goes here
        int[] aB = {num1, num2};
        Arrays.sort(aB);
        while(aB[0]>0){
            aB[1] = aB[1]%aB[0];
            Arrays.sort(aB);
        }
        return aB[1];
    }
}
