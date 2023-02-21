package algorithm.sort_long_desc_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortLongDesc {

    public static long solution(long n) {

        List<Long> longs = new ArrayList<>();
        while (n > 0) {
            long a = n % 10;
            n = n / 10;
            longs.add(a);
        }

        Collections.sort(longs, Comparator.reverseOrder());

        return Long.parseLong(longs.stream().map(String::valueOf).collect(Collectors.joining()));
    }
}
