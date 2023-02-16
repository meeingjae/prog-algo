package algorithm.sum_of_measure_16;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SumOfMeasureTest {

    @Test
    void test1() {
        //given:
        final int n = 12;
        final int expected = 28;
        //when:
        final int result = SumOfMeasure.solution(n);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {
        //given:
        final int n = 5;
        final int expected = 6;
        //when:
        final int result = SumOfMeasure.solution(n);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
