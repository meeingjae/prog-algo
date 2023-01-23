package algorithm.hatemiddlenumber;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HateMiddleNumberTest {

    @Test
    void 성공() {
        //given:
        final int[] source = {1,1,3,3,0,1,1};
        final int[] expected = {1,3,0,1};
        //when:
        final int[] result = HateMiddleNumber.solution(source);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
