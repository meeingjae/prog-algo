package algorithm.divisiblenum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DivisibleNumberTest {

    @Test
    void 성공() {
        //given:
        final int[] arr = { 5, 9, 7, 10 };
        final int divisor = 5;
        final int[] expected = { 5, 10 };
        //when:
        final int[] result = DivisibleNumber.solution(arr, divisor);
        //then:
        assertThat(result).isEqualTo(result);
    }
}
