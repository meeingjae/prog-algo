package algorithm.basic_string_10;

public class BasicString {

    private static final int CORRECT_NUM_1 = 4;
    private static final int CORRECT_NUM_2 = 6;

    public static boolean solution(String s) {

        boolean isTrue = false;
        if (s.length() == CORRECT_NUM_1 || s.length() == CORRECT_NUM_2) {
            isTrue = true;
        }
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                isTrue = false;
            }
        }
        return isTrue;
    }
}
