package algorithm.divisiblenum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibleNumber {

    private static final int EMPTY = -1;

    public static int[] solution(int[] arr, int divisor) {

        final List<Integer> result = new ArrayList<>();

        for (int j : arr) {
            if (j % divisor == 0) {
                result.add(j);
            }
        }
        if (result.isEmpty()) {
            return new int[] { EMPTY };
        }
        final int[] resultArr = result.stream().mapToInt(it -> it).toArray();
        Arrays.sort(resultArr);
        return resultArr;
    }
}
