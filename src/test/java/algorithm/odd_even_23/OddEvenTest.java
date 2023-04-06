package algorithm.odd_even_23;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OddEvenTest {

    @Test
    void test1() {
        //given:
        final int num = 3;
        //when:
        final String expected = "Odd";
        final String result = OddEven.solution(num);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {
        //given:
        final int num = 20000;
        //when:
        final String expected = "Even";
        final String result = OddEven.solution(num);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test3() {
        //given:
        final int num = -20000;
        //when:
        final String expected = "Even";
        final String result = OddEven.solution(num);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
