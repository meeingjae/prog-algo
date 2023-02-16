package algorithm.sum_of_measure_16;

public class SumOfMeasure {

    public static int solution(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
