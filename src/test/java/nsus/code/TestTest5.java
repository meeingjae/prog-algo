package nsus.code;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestTest5 {

    @Test
    void test1() {
        final String s = "2 1 5 6 2 3";
        final String expected = "10";
        final String result = Test5.solution(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {
        final String s = "1 2 3 4 5";
        final String expected = "8"; //4 * 2
        final String result = Test5.solution(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test3() {
        final String s = "1 1 1 1 1";
        final String expected = "5"; //1 * 5
        final String result = Test5.solution(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test4() {
        final String s = "5";
        final String expected = "5"; //1 * 5
        final String result = Test5.solution(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test5() {
        final String s = "0 0 1 0 0";
        final String expected = "1"; //1 * 1
        final String result = Test5.solution(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test6() {
        final String s = "0 0 1 0 0";
        final String expected = "1"; //1 * 1
        final String result = Test5.solution(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test7() {
        final String s = "0 0 0 0 0";
        final String expected = "0"; //0
        final String result = Test5.solution(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test8() {
        final String s = "2 0 2 0 2 0 2";
        final String expected = "2"; // 2 * 1
        final String result = Test5.solution(s);
        assertThat(result).isEqualTo(expected);
    }
}
