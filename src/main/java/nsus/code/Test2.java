package nsus.code;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Test2 {

    public static List<String> solution(List<String> wordList) {

        final HashMap<String, Integer> map = new HashMap<>();
        wordList.forEach(it -> {
            for (int i = 0; i < it.length(); i++) {
                final String s = it.substring(0, i + 1);
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
            }
        });
        final TreeMap<String, Integer> treeMap = new TreeMap<>(map);
        return treeMap.entrySet().stream().map(it -> it.getKey() + " " + it.getValue())
                .collect(Collectors.toList());
    }
}
