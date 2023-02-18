package algorithm.sum_digit_18;

public class SumDigit {

    public static int solution(int n) {

        char[] source = String.valueOf(n).toCharArray();
        int sum = 0;
        for (char c : source) {
            sum += Integer.parseInt(String.valueOf(c));
        }
        return sum;
    }
}
