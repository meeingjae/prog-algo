package algorithm.sumbetweentwointegers;

import org.junit.jupiter.api.Test;

import java.lang.instrument.Instrumentation;

import static org.assertj.core.api.Assertions.assertThat;

public class SumBetweenTwoIntegersTest {

    @Test
    void test1() {
        //given:
        final int source = 3;
        final int target = 5;
        final long expected = 12;
        //when:
        final long result = SumBetweenTwoIntegers.solution(source, target);
        //then:
        Instrumentation instrumentation = null;
        instrumentation.getObjectSize(SumBetweenTwoIntegers.class);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {
        //given:
        final int source = 3;
        final int target = 3;
        final long expected = 3;
        //when:
        final long result = SumBetweenTwoIntegers.solution(source, target);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test3() {
        //given:
        final int source = 5;
        final int target = 3;
        final long expected = 12;
        //when:
        final long result = SumBetweenTwoIntegers.solution(source, target);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
