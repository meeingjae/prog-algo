package algorithm.root_determination_21;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RootDeterminationTest {

    @Test
    void test1() {
        //given:
        final long n = 121;
        final long expected = 144;
        //when:
        final long result = RootDetermination.solution(n);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {
        //given:
        final long n = 3;
        final long expected = -1;
        //when:
        final long result = RootDetermination.solution(n);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
