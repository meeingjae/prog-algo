package algorithm.basicstring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BasicStringTest {

    @Test
    void test1() {
        //given:
        final String s = "a234";
        final boolean expected = false;
        //when:
        final boolean result = BasicString.solution(s);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {
        //given:
        final String s = "1234";
        final boolean expected = true;
        //when:
        final boolean result = BasicString.solution(s);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
