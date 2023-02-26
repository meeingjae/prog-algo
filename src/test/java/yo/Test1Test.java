package yo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Test1Test {

    @Test
    void test1() {

        final int n = 5;
        final int k = 2;

        final String expected = "abbba";
        final String result = Test1.solution(n, k);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {

        final int n = 8;
        final int k = 3;

        final String expected = "abccccba";
        final String result = Test1.solution(n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test3() {

        final int n = 3;
        final int k = 2;

        final String expected = "aba";
        final String result = Test1.solution(n, k);

        assertThat(result).isEqualTo(expected);
    }
}
