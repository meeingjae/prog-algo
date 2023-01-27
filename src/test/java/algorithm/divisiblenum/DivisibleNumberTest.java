package algorithm.divisiblenum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DivisibleNumberTest {

    @Test
    void case1() {
        //given:
        final int[] arr = { 5, 9, 7, 10 };
        final int divisor = 5;
        final int[] expected = { 5, 10 };
        //when:
        final int[] result = DivisibleNumber.solution(arr, divisor);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void case2() {
        //given:
        final int[] arr = { 2, 36, 1, 3 };
        final int divisor = 1;
        final int[] expected = { 1, 2, 3, 36 };
        //when:
        final int[] result = DivisibleNumber.solution(arr, divisor);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void case3() {
        //given:
        final int[] arr = { 3, 2, 6 };
        final int divisor = 10;
        final int[] expected = { -1 };
        //when:
        final int[] result = DivisibleNumber.solution(arr, divisor);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
