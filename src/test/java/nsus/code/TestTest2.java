package nsus.code;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestTest2 {

    @Test
    void name() {
        final List<String> wordList = new ArrayList<>();
        wordList.add("a");
        wordList.add("ab");
        wordList.add("abc");
        wordList.add("abcd");
        wordList.add("abcde");

        final List<String> result = Test2.solution(wordList);
        assertThat(result.get(0)).isEqualTo("a 5");
        assertThat(result.get(1)).isEqualTo("ab 4");
        assertThat(result.get(2)).isEqualTo("abc 3");
        assertThat(result.get(3)).isEqualTo("abcd 2");
        assertThat(result.get(4)).isEqualTo("abcde 1");
    }

    @Test
    void name1() {
        final List<String> wordList = new ArrayList<>();
        wordList.add("ada");
        wordList.add("bean");
        wordList.add("adam");
        wordList.add("ace");
        wordList.add("be");
        wordList.add("ac");

        final List<String> result = Test2.solution(wordList);
        assertThat(result.get(0)).isEqualTo("a 4");
        assertThat(result.get(1)).isEqualTo("ac 2");
        assertThat(result.get(2)).isEqualTo("ace 1");
        assertThat(result.get(3)).isEqualTo("ad 2");
        assertThat(result.get(4)).isEqualTo("ada 2");
    }

    @Test
    void test() {
        String a = "ab";
        String s = a.substring(0,4);
        System.out.println(s);
    }
}
