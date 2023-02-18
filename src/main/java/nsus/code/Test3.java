package nsus.code;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test3 {

    public static String[] solution(double total_amount, double[] share) {

        final double share_sum = Arrays.stream(share).reduce((d1, d2) -> d1 + d2).orElse(.0);
        String result = Arrays.stream(share)
                .map(s -> total_amount * (s / share_sum))
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(result);
        return new String[]{};
    }
}
