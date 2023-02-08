package algorithm.p_n_y_in_string_8;

public class PNYInString {

    private static final String P = "P";
    private static final String Y = "Y";

    static boolean solution(String s) {

        if (s == null || s.length() == 0) {
            return false;
        }
        int pCount = 0;
        int yCount = 0;
        for (char source : s.toCharArray()) {
            final String a = String.valueOf(source).toUpperCase();
            if (a.equals(P)) {
                pCount++;
            }
            if (a.equals(Y)) {
                yCount++;
            }
        }
        return pCount == yCount;
    }
}
