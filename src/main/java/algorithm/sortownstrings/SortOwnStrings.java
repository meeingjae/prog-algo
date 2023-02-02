package algorithm.sortownstrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortOwnStrings {

    public static String[] solution(String[] source, int n) {

        List<String> target = new ArrayList<>();
        for (String s : source) {
            target.add(s.charAt(n) + s);
        }
        Collections.sort(target);
        return target.stream().map(it -> it.substring(1)).toList().toArray(String[]::new);
    }
}
