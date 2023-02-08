package algorithm.sort_own_strings_7;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortOwnStringsTest {

    @Test
    void test1() {
        //given:
        final String[] source = { "sun", "bed", "car" };
        final int n = 1;
        final String[] expected = { "car", "bed", "sun" };
        //when:
        final String[] result = SortOwnStrings.solution(source, n);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {
        //given:
        final String[] source = { "abce", "abcd", "cdx" };
        final int n = 2;
        final String[] expected = { "abcd", "abce", "cdx" };
        //when:
        final String[] result = SortOwnStrings.solution(source, n);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
