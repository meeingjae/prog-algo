package yo;

import org.junit.jupiter.api.Test;

public class TT1Test {

    @Test
    void name() {
        String[] approved = {"123-4567", "451-2314", "015-1643"};
        String[] spam = {"111-1111"};
        String[] calls = {"123-4567", "000-0022", "015-1643", "000-0022", "111-1111", "000-0022", "111-1111", "111-1111"};
        int k = 2;
        int[] result = TT1.solution(approved,spam,calls,k);
        System.out.println(result);
    }
}
