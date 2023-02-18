package nsus.code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

    public static String solution(String input, int k) {

        final List<Character> inputList = new ArrayList<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                inputList.add(c);
            }
        }

        for (int i = 0; i < k; i++) {
            final char c = inputList.remove(inputList.size() - 1);
            inputList.add(0, c);
        }

        return inputList.stream().map(String::valueOf).collect(Collectors.joining(" "));
    }
}
