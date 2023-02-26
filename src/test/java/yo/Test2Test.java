package yo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Test2Test {

    @Test
    void test1() {

        final String[] R = { "...X..", "....XX", "..X..." };

        final int expected = 6;
        final int result = Test2.solution(R);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {

        final String[] R = { "....X..", "X......", ".....X.", "......." };

        final int expected = 15;
        final int result = Test2.solution(R);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test3() {

        final String[] R = { "...X.", ".X..X", "X...X", "..X.." };

        final int expected = 9;
        final int result = Test2.solution(R);

        assertThat(result).isEqualTo(expected);
    }
}
