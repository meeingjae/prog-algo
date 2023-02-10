package algorithm.seek_prime_12;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SeekPrimeTest {

    @Test
    void test1() {
        //given:
        final int n = 10;
        final int expected = 4;
        //when:
        final int result = SeekPrime.solution(n);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {
        //given:
        final int n = 5;
        final int expected = 3;
        //when:
        final int result = SeekPrime.solution(n);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
