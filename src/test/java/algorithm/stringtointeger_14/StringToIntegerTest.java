package algorithm.stringtointeger_14;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringToIntegerTest {

    @Test
    void test1() {
        //given:
        final String s = "1234";
        final int expected = 1234;
        //when:
        final int result = StringToInteger.solution(s);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {
        //given:
        final String s = "-1234";
        final int expected = -1234;
        //when:
        final int result = StringToInteger.solution(s);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
