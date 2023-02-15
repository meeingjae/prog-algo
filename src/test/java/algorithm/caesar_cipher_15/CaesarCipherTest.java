package algorithm.caesar_cipher_15;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CaesarCipherTest {

    @Test
    void test1() {
        //given:
        final String s = "AB";
        final int n = 1;
        final String expected = "BC";
        //when:
        final String result = CaesarCipher.solution(s,n);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {
        //given:
        final String s = "z";
        final int n = 1;
        final String expected = "a";
        //when:
        final String result = CaesarCipher.solution(s,n);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test3() {
        //given:
        final String s = "a B z";
        final int n = 4;
        final String expected = "e F d";
        //when:
        final String result = CaesarCipher.solution(s,n);
        //then:
        assertThat(result).isEqualTo(expected);
    }
}
