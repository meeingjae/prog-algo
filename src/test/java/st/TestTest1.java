package st;

import org.junit.jupiter.api.Test;
import st.Test1;
import st.TestTest2;

import static org.assertj.core.api.Assertions.assertThat;

public class TestTest1 {

    @Test
    void test1() {
        int n = 5;
        int expected = 5;
        int result = Test1.solution(n);
        assertThat(result).isEqualTo(expected);

    }

    @Test
    void test2() {
        //given:
        final int[] stats = {5,3,4,6,2,1};
        final int expected = 4;
        //when:
        final int result = TestTest2.solution(stats);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test3() {
        //given:
        final int[] stats = {6,2,3,4,1,5};
        final int expected = 3;
        //when:
        final int result = TestTest2.solution(stats);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
