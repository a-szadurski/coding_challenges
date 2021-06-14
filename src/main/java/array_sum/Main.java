package array_sum;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static boolean ArrayAddition(int[] arr) {
        // code goes here
        ArrayList<Integer> numPool = new ArrayList<>();
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            numPool.add(arr[i]);
        }

        return sum(numPool, max, new ArrayList<>(), false);
    }

    static boolean sum(ArrayList<Integer> numPool, int max, ArrayList<Integer> partial, boolean match) {
        int sum = 0;
        for (int elem : partial) {
            sum += elem;
        }
        if (match) {
            return true;
        }
        if (sum == max) {
            return true;
        }
        for (int i = 0; i < numPool.size(); i++) {
            ArrayList<Integer> rest = new ArrayList<>();
            int n = numPool.get(i);
            for (int j = i + 1; j < numPool.size(); j++) {
                rest.add(numPool.get(j));
            }
            ArrayList<Integer> partialR = new ArrayList<>(partial);
            partialR.add(n);
            match = sum(rest, max, partialR, match);
        }
        return match;
    }

    public static void main(String[] args) {
        System.out.println(ArrayAddition(new int[]{0, 6, -1, 8, 12}));
    }
}
