package interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
    /**
     * Iterate through each line of input.
     */
    public static String alterCase(String input) {
        input = input.toLowerCase();
        StringBuilder output = new StringBuilder();
        int counter = -1;
        for (char elem : input.toCharArray()) {
            if (Character.isLetter(elem)) {
                counter++;
                if (counter % 2 == 0) {
                    output.append(Character.toUpperCase(elem));
                } else {
                    output.append(elem);
                }
            } else {
                output.append(elem);
            }
        }
        return output.toString();
    }


    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(alterCase(line));
        }
    }
}
