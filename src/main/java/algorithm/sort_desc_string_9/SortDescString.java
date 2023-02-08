package algorithm.sort_desc_string_9;

import java.util.Arrays;
import java.util.Stack;

public class SortDescString {

    public static String solution(String source) {

        char[] charArray = source.toCharArray();
        final Stack<Character> cs = new Stack<>();
        Arrays.sort(charArray);
        for (char c : charArray) {
            cs.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!cs.empty()) {
            sb.append(cs.pop());
        }
        return sb.toString();
    }
}
