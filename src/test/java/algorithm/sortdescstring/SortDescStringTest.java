package algorithm.sortdescstring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortDescStringTest {

    @Test
    void test1() {
        //given:
        final String source = "Zbcdefg";
        final String expected = "gfedcbZ";
        //when:
        final String result = SortDescString.solution(source);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
