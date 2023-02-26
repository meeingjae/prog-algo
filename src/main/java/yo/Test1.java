package yo;

import java.util.Stack;

public class Test1 {

    private static final char START_CHAR = 'a';

    public static String solution(int N, int K) {

        if (N == 1) {
            return String.valueOf(START_CHAR);
        }

        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int usedIndex = 0;
        for (int i = 0; i < N / 2; i++) {
            if (i == 0) {
                stack.push(START_CHAR);
                result.append(START_CHAR);
                usedIndex++;
                continue;
            }
            char curWord = stack.peek();
            if (usedIndex < K) {
                curWord = (char) (curWord + 1);
                usedIndex++;
            }
            stack.push(curWord);
            result.append(curWord);
        }
        if (N % 2 == 1 && usedIndex < K) {
            result.append((char) (stack.peek() + 1));
        } else if (N % 2 == 1) {
            result.append(stack.peek());
        }
        int stackSize = stack.size();
        for (int i = 0; i < stackSize; i++) {
            result.append(stack.pop());
        }
        return result.toString();
    }
}
