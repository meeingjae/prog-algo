package algorithm.p_n_y_in_string_8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PNYInStringTest {

    @Test
    void test1() {
        //given:
        final String s = "pPoooyY";
        final boolean expected = true;
        //when:
        final boolean result = PNYInString.solution(s);
        //when:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {
        //given:
        final String s = "Pyy";
        final boolean expected = false;
        //when:
        final boolean result = PNYInString.solution(s);
        //when:
        assertThat(result).isEqualTo(expected);
    }
}
