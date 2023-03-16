package algorithm.minstack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinStackTest {

    @Test
    void test1() {
        //given:
        MinStack<Integer> stack = new MinStack<>();
        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(4);
        final int min1 = stack.min();
        assertThat(min1).isEqualTo(2);
        stack.pop();
        stack.pop();
        final int min2 = stack.min();
        assertThat(min2).isEqualTo(3);
    }
}
