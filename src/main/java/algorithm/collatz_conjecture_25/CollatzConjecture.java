package algorithm.collatz_conjecture_25;

public class CollatzConjecture {

    public static int solution(int n) {

        if (n == 1) {
            return 0;
        }
        int cnt = 0;
        while (cnt < 500) {
            if (n == 1) {
                return cnt;
            }
            if (n % 2 == 0) {
                n = n / 2;
                ++cnt;
            } else if (n % 2 == 1) {
                n = n * 3 + 1;
                ++cnt;
            } else {
                return -1;
            }
        }
        return cnt;
    }
}
