package algorithm.seek_kim_from_seoul_11;

import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;

public class SeekKimFromSeoulTest {

    @Test
    void test() {
        //given:
        final String[] seoul = { "Jane", "Kim" };
        final String expected = "김서방은 1에 있다";
        //when:
        final String result = SeekKimFromSeoul.solution(seoul);
        //then:
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() throws UnsupportedEncodingException {

        Charset utf8 = StandardCharsets.UTF_8;
        Charset utf16 = StandardCharsets.UTF_16;
        //        final String test = "\uD83C\uDFF4\uDB40\uDC67\uDB40\uDC62\uDB40\uDC77\uDB40\uDC6C\uDB40\uDC73\uDB40\uDC7F";
        //        final String test = "\uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC66";
        final String test = "\uD83D\uDFE8";
        int codepoint = test.codePointAt(0);
        System.out.println(codepoint);
        System.out.println(new String(Character.toChars(codepoint)));
        //        System.out.println(flag);
        System.out.println(test);
        System.out.println(test.getBytes(utf8).length);
        System.out.println(test.getBytes(utf16).length);

        byte[] utf8Bytes = test.getBytes("UTF-8");
        String utf8String = new String(utf8Bytes, "UTF-8");
        System.out.println(utf8Bytes.length);

        byte[] utf16Bytes = test.getBytes("UTF-16");
        System.out.println(utf16Bytes.length);
        String utf16String = new String(utf16Bytes, "UTF-16");

    }
}
