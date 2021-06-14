package array_sum;

import java.util.Arrays;

public class Main {
    public static boolean ArrayAddition(int[] arr) {
        // code goes here
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int sum = 0;
        for (int e : arr) {
            if (e != max) {
                sum += e;
            }
        }
        return sum >= max;
    }

    public static void main(String[] args) {
        System.out.println(ArrayAddition(new int[]{0, 11, -1, 8, 12}));
    }
}
