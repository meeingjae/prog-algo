package algorithm.year2016;

public class Year2016 {

    private static final String[] day         = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
    private static final int[]    month       = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    // 1월 1일은 금요일
    private static final int      FIRST_INDEX = 5;

    static public String solution(int a, int b) {
        //1월 1일
        int target = -1;
        if (a > 1) {
            for (int i = 0; i < a - 1; i++) {
                target += month[i];
            }
        }
        return day[(target + b + FIRST_INDEX) % 7];
    }
}
