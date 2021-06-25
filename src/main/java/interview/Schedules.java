//package interview;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.nio.charset.StandardCharsets;
//
//public class Schedules {
//    /**
//     * Iterate through each line of input.
//     */
//
//    public static String findSchedule(String input){
//        String[] lines = input.split("\\n");
//        int n = Integer.parseInt(lines[0]);
//        int[] prereq = new int[n];
//        for(String elem : lines){
//            String[] temp = elem.split("\\s");
//                for(int j = 0; j<temp.length-1; j++){
//                    prereq[j] = Integer.parseInt(temp[j+1]);
//            }
//        }
//
//    }
//
//    public static void main(String[] args) throws IOException {
//        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
//        BufferedReader in = new BufferedReader(reader);
//        String line;
//        while ((line = in.readLine()) != null) {
//            System.out.println(line);
//        }
//    }
//}
