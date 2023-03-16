package algorithm.minstack;

import java.util.Stack;

public class MinStack<T> extends Stack<Integer> {

    private final Stack<Integer> stack = new Stack<>();
    private final Stack<Integer> min   = new Stack<>();

    @Override
    public Integer push(Integer item) {

        if (stack.isEmpty()) {
            stack.push(item);
            min.push(item);
        }
        stack.push(item);
        if (min.peek() > item) {
            min.push(item);
        }
        return item;
    }

    @Override
    public Integer pop() {

        Integer popInt = stack.pop();
        if (popInt == (int) min.peek()) {
            min.pop();
        }
        return popInt;
    }

    public Integer min() {

        return min.peek();
    }
}
