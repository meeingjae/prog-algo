package algorithm.sort_long_desc_20;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortLongDescTest {

    @Test
    void test1() {
        //given:
        final long n = 118372;
        final long expected = 873211;
        //when:
        final long result = SortLongDesc.solution(n);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
