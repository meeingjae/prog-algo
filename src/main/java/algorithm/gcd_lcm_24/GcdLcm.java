package algorithm.gcd_lcm_24;

public class GcdLcm {

    public static int[] solution(int n, int m) {

        int[] result = new int[2];

        result[0] = gcd(n, m);
        result[1] = lcm(n, m);
        return result;
    }

    public static int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {

        return a * b / gcd(a, b);
    }
}
