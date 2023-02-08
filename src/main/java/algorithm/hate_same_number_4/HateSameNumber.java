package algorithm.hate_same_number_4;

import java.util.ArrayList;
import java.util.List;

public class HateSameNumber {

    public static int[] solution(int[] source) {
        int saveNum = -1;
        final List<Integer> result = new ArrayList<>();
        for(int a : source) {
            if (saveNum != a) {
                result.add(a);
                saveNum = a;
            }
        }
        return result.stream().mapToInt(it -> it).toArray();
    }
}
