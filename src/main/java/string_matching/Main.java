package string_matching;

import java.util.HashMap;

public class Main {

    public static String StringScramble(String input, String target) {
        // code goes here
        HashMap<Character, Integer> targetMap = new HashMap<>();
        HashMap<Character, Integer> matchMap = new HashMap<>();

        for(int i = 0; i < target.length(); i++){
            targetMap.put(target.charAt(i), targetMap.getOrDefault(target.charAt(i), 0) + 1);
        }

        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if(targetMap.containsKey(c)){
                if(matchMap.get(c) == null){
                    matchMap.put(c, matchMap.getOrDefault(c, 0) + 1);
                }
                else if(matchMap.get(c) < targetMap.get(c)){
                    matchMap.put(c, matchMap.getOrDefault(c, 0) + 1);
                }
            }
        }
        System.out.println(targetMap + matchMap.toString());

        if(targetMap.equals(matchMap)){
            return "true";
        }

        return "false";
    }

    public static void main(String[] args) {
        System.out.println(StringScramble("coodrebtqqkye", "coderbyte"));
    }
}
