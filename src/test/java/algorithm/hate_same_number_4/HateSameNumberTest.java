package algorithm.hate_same_number_4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HateSameNumberTest {

    @Test
    void 성공() {
        //given:
        final int[] source = {1,1,3,3,0,1,1};
        final int[] expected = {1,3,0,1};
        //when:
        final int[] result = HateSameNumber.solution(source);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 같은_숫자() {
        //given:
        final int[] source = {4,4,4,3,3};
        final int[] expected = {4,3};
        //when:
        final int[] result = HateSameNumber.solution(source);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
