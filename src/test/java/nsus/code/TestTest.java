package nsus.code;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestTest {

    @Test
    void test() {

        final String input = "3 8 9 7 6";
        final int k = 3;
        final String expected = "9 7 6 3 8";

        final String result = Test1.solution(input, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test1() {

        final String input = "1 2";
        final int k = 1;
        final String expected = "2 1";

        final String result = Test1.solution(input, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {

        final String input = "3 6 7 3 2 9 1";
        final int k = 7;
        final String expected = "3 6 7 3 2 9 1";

        final String result = Test1.solution(input, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test3() {

        final String input = "a d h g o";
        final int k = 2;
        final String expected = "g o a d h";

        final String result = Test1.solution(input, k);
        assertThat(result).isEqualTo(expected);
    }
}
