package first_intersection;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

class Main {

    public static String FindIntersection(String[] strArr) {
        // code goes here
        TreeSet<Integer> leftStr =
                Arrays.stream(strArr[0].replace(" ", "").split(","))
                        .map(Integer::parseInt)
                        .collect(Collectors.toCollection(TreeSet::new));

        TreeSet<Integer> rightStr =
                Arrays.stream(strArr[1].replace(" ", "").split(","))
                        .map(Integer::parseInt)
                        .collect(Collectors.toCollection(TreeSet::new));

        leftStr.retainAll(rightStr);

        StringBuilder solution = new StringBuilder();

        if (!leftStr.isEmpty()) {
            for (int elem : leftStr) {
                solution.append(elem).append(",");
            }
            return solution.deleteCharAt(solution.lastIndexOf(",")).toString();
        }

        return "false";
    }

    public static void main(String[] args) {
        // keep this function call here
        String[] input = new String[]{"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
        System.out.println(FindIntersection(input));
//        Scanner s = new Scanner(System.in);
//        System.out.print(FindIntersection(s.nextLine()));
    }

}
