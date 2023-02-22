package algorithm.remove_min_num_22;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoveMinNumTest {

    @Test
    void test1() {
        //given:
        final int[] arr = {4,3,2,1};
        final int[] expected = {4,3,2};
        //when:
        final int[] result = RemoveMinNum.solution(arr);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {
        //given:
        final int[] arr = {10};
        final int[] expected = {-1};
        //when:
        final int[] result = RemoveMinNum.solution(arr);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
