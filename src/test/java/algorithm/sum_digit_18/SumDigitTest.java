package algorithm.sum_digit_18;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SumDigitTest {

    @Test
    void test1() {
        //given:
        final int n = 123;
        final int expected = 6;
        //when:
        final int result = SumDigit.solution(n);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {
        //given:
        final int n = 987;
        final int expected = 24;
        //when:
        final int result = SumDigit.solution(n);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
