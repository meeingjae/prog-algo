package algorithm.reverse_to_array_19;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseToArrayTest {

    @Test
    void test1() {
        //given:
        final long n = 12345;
        final int[] expected = { 5, 4, 3, 2, 1 };
        //when:
        final int[] result = ReverseToArray.solution(n);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
