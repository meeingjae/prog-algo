package algorithm.sum_between_two_integers_6;

public class SumBetweenTwoIntegers {

    public static long solution(int a, int b) {

        if (a == b) {
            return a;
        }

        long result = 0;
        if (b > a) {
            while (b >= a) {
                result += a++;
            }
        } else {
            while (a >= b) {
                result += b++;
            }
        }
        return result;
    }
}
