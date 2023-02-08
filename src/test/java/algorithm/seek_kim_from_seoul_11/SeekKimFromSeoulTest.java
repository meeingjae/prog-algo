package algorithm.seek_kim_from_seoul_11;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SeekKimFromSeoulTest {

    @Test
    void test() {
        //given:
        final String[] seoul = {"Jane","Kim"};
        final String expected = "김서방은 1에 있다";
        //when:
        final String result = SeekKimFromSeoul.solution(seoul);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
