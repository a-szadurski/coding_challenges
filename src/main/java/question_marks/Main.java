package question_marks;

class Main {
    public static String QuestionsMarks(String str) {

        char[] chars = str.toCharArray();
        int sum = 0;
        int qMarks = 0;
        int truthCount = 0;

        for (char elem : chars) {

            if (sum == 0 && Character.isDigit(elem)) {
                sum += Character.getNumericValue(elem);
            } else if (Character.isDigit(elem)) {
                sum += Character.getNumericValue(elem);
                if (sum == 10) {
                    if (qMarks != 3) {
                        return "false";
                    }
                    truthCount++;
                    qMarks = 0;
                }
                sum = Character.getNumericValue(elem);

            } else if (elem == '?' && sum != 0) {
                qMarks++;
            }
        }

        if (truthCount > 0) {
            return "true";
        }
        return "false";
    }

    public static void main(String[] args) {
        // keep this function call here
        System.out.println(QuestionsMarks("5??aaaaaaaaaaaaaaaaaaa?5?a??5"));
//        Scanner s = new Scanner(System.in);
//        System.out.print(QuestionsMarks(s.nextLine()));
    }

}
