package algorithm.year2016;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Year2016Test {

    @Test
    void 성공() {
        //given:
        final int month = 5;
        final int day = 24;
        final String expected = "TUE";
        //when:
        final String result = Year2016.solution(month, day);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
