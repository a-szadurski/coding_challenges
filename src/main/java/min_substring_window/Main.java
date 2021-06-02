package min_substring_window;

import java.util.HashMap;

class Main {

    public static String MinWindowSubstring(String[] strArr) {
        // code goes here
        String input = strArr[0];
        String target = strArr[1];

        HashMap<Character, Integer> targetMap = new HashMap<>();
        HashMap<Character, Integer> windowMap = new HashMap<>();
        int left = 0;
        int right = 0;
        int valid = 0;
        int start = 0;
        int windowLength = Integer.MAX_VALUE;

        for (int i = 0; i < target.length(); i++) {
            targetMap.put(target.charAt(i), targetMap.getOrDefault(target.charAt(i), 0) + 1);
        }

        while (right < input.length()) {

            char c = input.charAt(right);

            if (targetMap.containsKey(c)) {
                windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);
                if (windowMap.get(c).equals(targetMap.get(c))) {
                    valid++;
                }
            }
            right++;

            while (valid == targetMap.size()) {

                if (right - left < windowLength) {
                    start = left;
                    windowLength = right - left;
                }

                char d = input.charAt(left);

                if (targetMap.containsKey(d)) {
                    if (windowMap.get(d).equals(targetMap.get(d)))
                        valid--;
                    windowMap.put(d, windowMap.get(d) - 1);
                }
                left++;
            }
        }

        return windowLength == Integer.MAX_VALUE ? "" : input.substring(start, start + windowLength);
    }

    public static void main(String[] args) {
        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        System.out.print(MinWindowSubstring(s.nextLine()));
    }

}
