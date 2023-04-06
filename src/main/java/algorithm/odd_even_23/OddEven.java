package algorithm.odd_even_23;

public class OddEven {

    public static String solution(int num) {

        return Math.abs(num) % 2 == 1 ? "Odd" : "Even";
    }
}
