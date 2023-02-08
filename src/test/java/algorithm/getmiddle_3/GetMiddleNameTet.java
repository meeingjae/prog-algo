package algorithm.getmiddle_3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GetMiddleNameTet {

    @Test
    void 홀수() {
        //given:
        final String source = "abcde";
        final String expected = "c";
        //when:
        final String result = GetMiddleName.solution(source);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 짝수() {
        //given:
        final String source = "abcdef";
        final String expected = "cd";
        //when:
        final String result = GetMiddleName.solution(source);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
