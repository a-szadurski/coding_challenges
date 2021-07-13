package repeating_values;


import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

class RepeatingNumbers {

    public static int SimpleMode(int[] arr) {
        // code goes here
        LinkedHashMap<Integer, Integer> modeMap = new LinkedHashMap<>();
        int count = 1;
        int result = -1;

        for (int i : arr) {
            modeMap.put(i, modeMap.getOrDefault(i, 0) + 1);
        }

        Set<Integer> modeMapKeys = modeMap.keySet();

        for (Integer key : modeMapKeys) {
            int value = modeMap.get(key);
            if (value > count) {
                count = value;
                result = key;
            }
        }


        return result;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
//        System.out.print(SimpleMode(s.nextLine()));
    }

}
