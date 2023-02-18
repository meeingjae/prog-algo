package nsus.code;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestTest3 {

    @Test
    void name() {

        final double total_amount = 10;
        final double[] share = { 1.0, 2.0, 3.0, 4.0 };

        final String[] expected = { "1.0", "2.0", "3.0", "4.0" };
        final String[] result = Test3.solution(total_amount, share);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {

    }
}
