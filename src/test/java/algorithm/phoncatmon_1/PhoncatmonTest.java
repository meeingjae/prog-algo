package algorithm.phoncatmon_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PhoncatmonTest {

    @Test
    void name() {
        //given:
        final int[] nums = {3,1,2,3};
        //when:
        Phoncatmon phoncatmon = new Phoncatmon();
        int result = phoncatmon.solution(nums);
        //then:
        assertThat(result).isEqualTo(2);
    }
}
