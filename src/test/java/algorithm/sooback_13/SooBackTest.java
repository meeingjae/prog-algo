package algorithm.sooback_13;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SooBackTest {

    @Test
    void test1() {
        //given:
        final int n = 3;
        final String expected = "수박수";
        //when:
        final String result = SooBack.solution(n);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {
        //given:
        final int n = 4;
        final String expected = "수박수박";
        //when:
        final String result = SooBack.solution(n);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
