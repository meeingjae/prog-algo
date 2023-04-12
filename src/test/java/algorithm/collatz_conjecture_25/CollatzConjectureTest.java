package algorithm.collatz_conjecture_25;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CollatzConjectureTest {

    @Test
    void test1() {
        //given:
        final int n = 6;
        final int expected = 8;
        //when:
        final int result = CollatzConjecture.solution(n);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {
        //given:
        final int n = 16;
        final int expected = 4;
        //when:
        final int result = CollatzConjecture.solution(n);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test3() {
        //given:
        final int n = 626331;
        final int expected = -1;
        //when:
        final int result = CollatzConjecture.solution(n);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
