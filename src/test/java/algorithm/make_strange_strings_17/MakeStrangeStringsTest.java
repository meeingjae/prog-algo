package algorithm.make_strange_strings_17;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MakeStrangeStringsTest {

    @Test
    void test1() {
        //given:
        final String s = "try hello world";
        final String expected = "Try HeLIO WoRID";
        //when:
        final String result = MakeStrangeStrings.solution(s);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
