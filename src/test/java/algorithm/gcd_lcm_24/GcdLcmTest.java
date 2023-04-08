package algorithm.gcd_lcm_24;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GcdLcmTest {

    @Test
    void test1() {

        final int n = 3;
        final int m = 12;
        final int[] expected = { 3, 12 };
        final int[] result = GcdLcm.solution(n, m);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void test2() {

        final int n = 2;
        final int m = 5;
        final int[] expected = { 1, 10 };
        final int[] result = GcdLcm.solution(n, m);
        assertThat(result).containsExactly(expected);
    }
}
