package algorithm.sort_desc_string_9;

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
